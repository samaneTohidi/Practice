package com.amorphteam.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var image: ImageView
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image = findViewById(R.id.image_mench)
        button = findViewById(R.id.button_mench)

        button.setOnClickListener {
            setRandomMench()
        }
    }

    private fun setRandomMench(){
        when(Random.nextInt(6)){
            1-> image.setImageResource(R.drawable.dice_1)
            2-> image.setImageResource(R.drawable.dice_2)
            3-> image.setImageResource(R.drawable.dice_3)
            4-> image.setImageResource(R.drawable.dice_4)
            5-> image.setImageResource(R.drawable.dice_5)
            else -> image.setImageResource(R.drawable.dice_6)
        }


    }


}