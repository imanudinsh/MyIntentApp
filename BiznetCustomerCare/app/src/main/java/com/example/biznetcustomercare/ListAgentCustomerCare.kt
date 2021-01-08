package com.example.biznetcustomercare

import android.content.Intent
import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper.prepare
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class ListAgentCustomerCare : AppCompatActivity() {

//    private val dataNamaAgentCustomerCare = arrayOf("Ardiansyah",
//        "Ahmad Farhan",
//        "Anesia Kinanti",
//        "Daniel Belsaber",
//        "Dede Suhendar",
//        "Dicky Rachmadi",
//        "Fatma Rini Astuti",
//        "Imam Choirudin",
//        "M Abdul Alim Alami",
//        "Usep Sutrisna")

    private lateinit var adapter: AgentAdapter
    private lateinit var dataName: Array<String>
    private lateinit var dataEmail: Array<String>
    private lateinit var dataNoTlp: Array<String>
    private lateinit var dataPhoto: TypedArray
    private var agents = arrayListOf<Agent>()

    private fun prepare() {
        dataName = resources.getStringArray(R.array.data_name)
        dataEmail = resources.getStringArray(R.array.data_email)
        dataNoTlp = resources.getStringArray(R.array.data_no_tlp)
        dataPhoto = resources.obtainTypedArray(R.array.data_photo)
    }

    private fun addItem() {
        for (position in dataName.indices) {
            val agent = Agent(
                    dataPhoto.getResourceId(position, 0),
                    dataName[position],
                    dataEmail[position],
                    dataNoTlp[position]
            )
            agents.add(agent)
        }
        adapter.agents = agents
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_agent_customer_care)
        val listView: ListView = findViewById(R.id.lv_list)
        adapter = AgentAdapter(this)
        listView.adapter = adapter

        prepare()
        addItem()

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            Toast.makeText(this@ListAgentCustomerCare, "Kamu memilih " + agents[position].nama, Toast.LENGTH_SHORT)
                .show()

            val moveIntentProfileActivity = Intent (this@ListAgentCustomerCare, AboutProfileActivity::class.java)
            moveIntentProfileActivity.putExtra(AboutProfileActivity.EXTRA_AGENT, agents[position])
            startActivity(moveIntentProfileActivity)

        supportActionBar?.title = "List Agent Customer Care"
        }

    }

}