package com.example.myintentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_move_activity.setOnClickListener {

            val moveIntent = Intent (this@MainActivity, MoveActivity::class.java)
            startActivity(moveIntent)

        }

        btn_move_activity_data.setOnClickListener  {
            val moveWithDataIntent = Intent (this@MainActivity, MoveWithDataActivity::class.java )
            // String constant lebih baik tidak mengambil dari kelas activity lain. bisa dengan membuat file kumpulan kumpulan constant untuk dipakai banyak kelas activity
            moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Dicky Rachmadi")
            moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 27)
            startActivity(moveWithDataIntent)
        }

        btn_dial_number.setOnClickListener {
            val myPhoneNumber = "087775760360"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$myPhoneNumber"))
            startActivity(dialPhoneIntent)
        }

        btn_MyRecylerView.setOnClickListener {
            val moveIntentRecyclerView = Intent (this@MainActivity, MyRecyclerView::class.java)
            startActivity(moveIntentRecyclerView)
        }

        supportActionBar?.title = "Menu Belajar"

    }


}
