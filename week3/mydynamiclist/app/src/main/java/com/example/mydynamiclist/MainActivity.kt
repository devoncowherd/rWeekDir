package com.example.mydynamiclist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tacos : View = findViewById(R.id.list_view)
        var listView = findViewById(R.id.name_list_view)
        //val food1 = Food("","","","")
        val foodItemList  = Food("","","","").getFoodItems("food.json", this)

        var listItems = arrayOfNulls<String>(foodItemList.size)

        var i = 0
        listItems[i] = foodItemList[i].name

        for(i in 0..foodItemList.size - 1)
        {
            listItems[i] = foodItemList[i].name
        }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,listItems)
        list_view.adapter = adapter
    }
}