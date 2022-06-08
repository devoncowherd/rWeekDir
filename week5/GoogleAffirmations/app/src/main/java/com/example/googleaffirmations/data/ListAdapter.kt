package com.example.googleaffirmations.data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.googleaffirmations.R
import kotlinx.android.synthetic.main.recycler_layout.view.*

class ListAdapter(private val context : Context, private val dataset : List<Affirmations>)
    : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.recycler_layout, parent, false)

        return ListViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val item = dataset[position]

        holder.view.affirmation_text.text =  context.resources.getString(item.stringResourceId)

    }

    override fun getItemCount() = dataset.size

    class ListViewHolder(val view : View) : RecyclerView.ViewHolder(view){
        val holder : View = view.findViewById(R.id.recycler_layout)
    }
}