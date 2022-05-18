package com.example.diceroller2

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(5, 3 + 2)
    }

    @Test
    fun generatesNumber()
    {
        val d1 = RNG(12)
        var result = d1.getNum()
        assertTrue("RNG not within 1..6",result in 1..6)
    }
/*    @Test
    fun addition_isFalse()
    {
        assertEquals(5, 3 + 3)
    }*/
}