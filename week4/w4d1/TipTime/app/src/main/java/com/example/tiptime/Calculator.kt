package com.example.tiptime

import android.view.View
import android.widget.EditText
import android.widget.TextView

class Calculator()
{

    companion object{
        fun getServiceFee(view : EditText) : Double {
            if(view.text.toString() != "") {
                return view.text.toString().toDouble()
            }
            return 0.toDouble()
        }

        fun calculate(serviceFee : Double, tipPercent : Double) : Double {
            return serviceFee * tipPercent
        }
    }


}