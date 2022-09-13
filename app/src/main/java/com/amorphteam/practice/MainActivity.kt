package com.amorphteam.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import com.amorphteam.practice.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val player: Player = Player("samane")
    var turn: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.playerName = player

        binding.buttonMench.setOnClickListener {
            setPlayerName()
            setRandomMench()
        }
    }

    private fun setPlayerName() {
        binding.apply{
        if(turn){
            binding.playerName?.player = "Samane"
            invalidateAll()
            turn = false
        }else{
            binding.playerName?.player = "Aref"
            invalidateAll()
            turn = true
        }
        }
    }

    private fun setRandomMench(){
        binding.apply {
        when(Random.nextInt(6)){
            1-> imageMench.setImageResource(R.drawable.dice_1)
            2-> imageMench.setImageResource(R.drawable.dice_2)
            3-> imageMench.setImageResource(R.drawable.dice_3)
            4-> imageMench.setImageResource(R.drawable.dice_4)
            5-> imageMench.setImageResource(R.drawable.dice_5)
            else -> imageMench.setImageResource(R.drawable.dice_6)

            }
        }


    }


}