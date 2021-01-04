package com.example.myintentapp

import android.content.Intent
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
            moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Dicky Rachmadi")
            moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 27)
            startActivity(moveWithDataIntent)
        }
    }
}
