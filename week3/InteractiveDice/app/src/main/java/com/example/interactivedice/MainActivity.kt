package com.example.interactivedice

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 * Dalvik Virtual Machine is like the JVM/ JRE/NODE.js
 */
//60,30,10 rule
//60 percent by one color, 30 by another, 10 by another
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);



        val rollButton : View = findViewById(R.id.roll_button);
        val resultText : TextView = findViewById(R.id.roll_result);
        //turns the dice image into a variable
        val diceImage : ImageView = findViewById(R.id.dice_img);
        //creates a cube dice object
        var cube = Dice();

        rollButton.setOnClickListener{
            cube.rollDice(diceImage, resultText);
            Toast.makeText(this,"Dice Rolled!",Toast.LENGTH_SHORT);
        }
    }

}