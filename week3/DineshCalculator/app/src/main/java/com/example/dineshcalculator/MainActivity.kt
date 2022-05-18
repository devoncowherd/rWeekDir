package com.example.dineshcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        }

    var canAddOperation = false;
    var canAddDecimal = true;

    fun getNum(view : View)
    {

        if(view is Button)
        {
            if(view.text == ".")
            {
                if(canAddDecimal)
                {
                    input.append(view.text)
                    canAddDecimal = false;
                    canAddOperation = false;
                }
            }
            else
            {
                if(input.text.toString() == "0")
                {
                    input.text=""
                }

                input.append(view.text)
                canAddOperation = true;
                canAddDecimal = true;
            }
        }
    }

    fun getOp(view : View)
    {
        if(view is Button && canAddOperation)
        {
            input.append(view.text)
            canAddOperation = false;
        }
    }

    fun clearAll(view : View)
    {
        input.text ="0";
        result.text = "0";
    }

    fun backspace(view : View)
    {
        val length = input.length()
        if(length > 0)
        {
            input.text = input.text.subSequence(0, length - 1)
        }
    }

    fun equals(view: View)
    {
        result.text = calculateResult()
    }

    fun calculateResult() : String
    {
        val digitOperator = digitOperator()
        if(digitOperator.isEmpty())
        {
            return ""
        }

        val timesDivision = timesDivisionCalculate(digitOperator)

        if(timesDivision.isEmpty())
        {
            return ""
        }

        val result = addSubtract(timesDivision)

        return result.toString()
    }

    fun digitOperator() : MutableList<Any>
    {
        var list = mutableListOf<Any>()
        var currentDigit = ""
        for(character in input.text)
        {
            if(character.isDigit() || character == '.')
            {
                currentDigit += character
            }
            else
            {
                list.add(currentDigit.toDouble())
                currentDigit = ""
                list.add(character)

            }
        }

        if(currentDigit != "")
        {
            list.add(currentDigit.toDouble())
        }

        println(list)
        return list

    }

    fun timesDivisionCalculate(list : MutableList<Any>) : MutableList<Any>
    {
            var list1 = list
            while(list1.contains('×') || list.contains('÷'))
            {
                list1 = calcTimesDiv(list1)
        }
        return list1
    }

    fun calcTimesDiv(list : MutableList<Any>) : MutableList<Any>
    {
        val newList = mutableListOf<Any>()

        var restartIndex = list.size

        for(i in list.indices)
        {
            if(list[i] is Char && i != list.lastIndex && i < restartIndex)
            {
                val operator = list[i]
                val prev = list[i - 1] as Double
                val next = list[i + 1] as Double
                when(operator)
                {
                    '×' ->
                    {
                        newList.add(prev * next)
                        restartIndex = i + 1
                    }
                    '÷' ->
                    {
                        newList.add(prev / next)
                        restartIndex = i + 1
                    }
                    else ->
                    {
                        newList.add(prev)
                        newList.add(operator)
                    }
                }
            }
            if(i > restartIndex)
            {
                newList.add(list[i])
            }
        }
        println(newList)
        return newList
    }

    fun addSubtract(list : MutableList<Any>) : Double
    {
        var result = list[0] as Double

        for(i in list.indices)
        {
            if(list[i] is Char && i != list.lastIndex)
            {
                val operator = list[i]
                val next = list[i + 1] as Double
                if(operator == '+')
                {
                    result += next
                }
                if(operator == '-')
                {
                    result -= next
                }

            }
        }
        println(result)
        return result
    }





}