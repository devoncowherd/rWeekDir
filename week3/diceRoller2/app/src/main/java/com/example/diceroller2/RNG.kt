package com.example.diceroller2

class RNG(_sides : Int)
{
    var sides : Int = _sides

    fun getNum(): Int {
        return (1 until sides).random()
    }

    fun checkResult(result : Int) : String
    {
        when(result)
        {
            1 -> return "Ouch..! Better luck next time!"
            2 -> return "...Could be worse?"
            3 -> return "Mid. Just mid."
            4 -> return "Not bad!"
            5 -> return "Well done!"
            6 -> return "Jackpot!"
        }
        return "Wait...how was this code reached?"
    }
}
