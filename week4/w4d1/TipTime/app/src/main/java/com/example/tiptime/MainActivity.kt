package com.example.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val serviceFee : EditText = findViewById(R.id.service_fee)
        val calculate : View = findViewById(R.id.calculate)
        val okayRadio : View  = findViewById(R.id.okay)
        val goodRadio : View = findViewById(R.id.good)
        val amazingButton : View = findViewById(R.id.amazing)
        val roundSwitch : View = findViewById(R.id.round_switch)

        var percent : Double = 0.15
        var round : Boolean = true

        roundSwitch.setOnClickListener{
            if(round){
                round = false
            } else {
                round = true
            }
        }
        okayRadio.setOnClickListener{
            percent = 0.15
        }
        goodRadio.setOnClickListener{
            percent = 0.18
        }
        amazingButton.setOnClickListener{
            percent = 0.20
        }

        calculate.setOnClickListener{
            if(!round) {
                val tip = Calculator.calculate(Calculator.getServiceFee(serviceFee), percent)
                Toast.makeText(this,"You should tip ${tip}",Toast.LENGTH_SHORT).show()
            } else {
                val tip = (Calculator.calculate(Calculator.getServiceFee(serviceFee), percent)).toInt()
                Toast.makeText(this,"You should tip ${tip}",Toast.LENGTH_SHORT).show()
            }
        }
    }
}