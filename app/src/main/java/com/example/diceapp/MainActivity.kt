package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val roll : Button = findViewById(R.id.button)
        val diceimage : ImageView = findViewById(R.id.imageView)
        roll.setOnClickListener {
            val rand = (1..6).random()
            val toast = Toast.makeText(this,rand.toString(),Toast.LENGTH_SHORT).show()
            when (rand) {
                1 -> diceimage.setImageResource(R.drawable.dice_1)
                2 -> diceimage.setImageResource(R.drawable.dice_2)
                3 -> diceimage.setImageResource(R.drawable.dice_3)
                4 -> diceimage.setImageResource(R.drawable.dice_4)
                5 -> diceimage.setImageResource(R.drawable.dice_5)
                6 -> diceimage.setImageResource(R.drawable.dice_6)
            }




        }
    }
}