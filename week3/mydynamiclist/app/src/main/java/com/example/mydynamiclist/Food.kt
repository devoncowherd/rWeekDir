package com.example.mydynamiclist

import android.content.Context
import org.json.JSONObject
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets.UTF_8

class Food(
    var name : String,
    var image : String,
    var description : String,
    var category : String){



    fun getFoodItems(filename : String, context : Context) : ArrayList<Food>
    {
        val foodItemList = ArrayList<Food>()
        val jsonStr = getJsonFromAssets(filename, context)
        println(jsonStr)
        val foodJSON = JSONObject(jsonStr)
        val foodList = foodJSON.getJSONArray("foods")
        println(foodList)
        (0 until foodList.length()).mapTo(foodItemList)
        {
            Food(
                foodList.getJSONObject(it).getString("name"),
                foodList.getJSONObject(it).getString("image"),
                foodList.getJSONObject(it).getString("description"),
                foodList.getJSONObject(it).getString("category"),
            )
        }
        return foodItemList
    }
// companion is like static which allows you to access it from the class name
    companion object {
        fun getJsonFromAssets(filename: String, context: Context): String? {
            var jsonStr: String? = null
            //opens a stream of data from the file
            val inStream = context.assets.open(filename)
            val size = inStream.available()
            //puts the bytes into an array
            val buffer = ByteArray(size)
            //reads the array
            inStream.read(buffer)
            inStream.close()
            //converts it to a String
            jsonStr = String(buffer, Charsets.UTF_8)
            //buffers are necessary because read speed is different than loading speed which can cause error
            //you don't wnat to operate on incomplete data
            return jsonStr
        }
    }
}