package com.example.diceroller2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cube = RNG(6)
        val rngButton : View = findViewById(R.id.roll_button)
        val resultDisplay : TextView = findViewById(R.id.result)
        val prompt : TextView = findViewById(R.id.prompt)

        rngButton.setOnClickListener{
            val result = cube.getNum()
            resultDisplay.text = result.toString()
            prompt.text = cube.checkResult(result)
            Toast.makeText(this,"Dice Rolled!",Toast.LENGTH_SHORT).show()
        }
    }

}