package com.example.interactivedice

import android.widget.ImageView
import android.widget.TextView

class Dice()
{
    val sides = 6;
    fun rollDice(imageview : ImageView , textview : TextView)
    {
        val result = (1..sides).random();


        if(result == 1)
        {
            imageview.setImageResource(R.drawable.dice_result_one);
            textview.setText("1");
        }
        else if(result == 2)
        {
            imageview.setImageResource(R.drawable.dice_result_two);
            textview.setText("2");

        }
        else if(result == 3)
        {
            imageview.setImageResource(R.drawable.dice_result_three);
            textview.setText("3");

        }
        else if(result == 4)
        {
            imageview.setImageResource(R.drawable.dice_result_four);
            textview.setText("4");

        }
        else if(result == 5)
        {
            imageview.setImageResource(R.drawable.dice_result_five);
            textview.setText("5");

        }
        else
        {
            imageview.setImageResource(R.drawable.dice_result_six);
            textview.setText("6");

        }
    }
}