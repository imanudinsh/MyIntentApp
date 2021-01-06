package com.example.myintentapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_my_recycler_view.*

class MyRecyclerView : AppCompatActivity() {
    private var list: ArrayList<Logos> = arrayListOf()

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private var title: String = "Mode List"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_recycler_view)

        rv_logos.setHasFixedSize(true)

        list.addAll(LogosData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList(){
        rv_logos.layoutManager = LinearLayoutManager(this)
        val listLogosAdapter = ListLogosAdapter(list)
        rv_logos.adapter = listLogosAdapter
    }

    private fun showRecyclerGrid(){
        rv_logos.layoutManager = GridLayoutManager(this, 2)
        val GridLogosAdapter = GridLogosAdapter (list)
        rv_logos.adapter = GridLogosAdapter
    }

    private fun showRecyclerCardView(){
        rv_logos.layoutManager = LinearLayoutManager(this)
        val CardViewLogosAdapter = CardViewLogosAdapter (list)
        rv_logos.adapter = CardViewLogosAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }



    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                title = "Mode List"
                showRecyclerList()
            }

            R.id.action_grid -> {
                title = "Mode Grid"
                showRecyclerGrid()
            }

            R.id.action_CardView -> {
                title = "Mode Card View"
                showRecyclerCardView()
            }
        }
        setActionBarTitle(title)
    }



}