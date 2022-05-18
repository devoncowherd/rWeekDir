package com.example.mydynamiclist

import android.view.LayoutInflater
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//layout inflators create a view out of existing xmls
//use layoutinflater if the view doens't exist

class FoodAdapter (val context : Context, val dataSource : ArrayList<Food>) : BaseAdapter()
{

    var inflater = LayoutInflater.from(context)

    override fun getCount(): Int {
        return dataSource.size
    }

    override fun getItem(position: Int): Any {
        return dataSource[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()

    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view : View = inflater.inflate(R.layout.list_item_food, parent, false)
        var holder : RecyclerView.ViewHolder

        var holder =
        view.findViewById(R.id.food_thumbnail) as ImageView
        view.findViewById(R.id.food_name) as TextView
        view.findViewById(R.id.food_description) as TextView
        view.findViewById(R.id.food_category) as TextView


        return view
    }
}