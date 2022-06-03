package com.example.questr.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.questr.R
import kotlinx.android.synthetic.main.fragment_current_list.view.*
import kotlinx.android.synthetic.main.recycler_layout.view.*

class QuestsAdapter() : RecyclerView.Adapter<QuestsAdapter.MyViewHolder>() {

    var questList = emptyList<Quests>()


    class MyViewHolder(_view : View) : RecyclerView.ViewHolder(_view){
        var view = _view
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_layout, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItem = questList[position]

        holder.view.item_title.text = currentItem.title
        holder.view.item_date.text = currentItem.date


        holder.view.setOnClickListener {

            QuestsViewModel.tempID = currentItem.id
            QuestsViewModel.tempTitle = currentItem.title
            QuestsViewModel.tempDescription = currentItem.description
            QuestsViewModel.tempDate = currentItem.date
            QuestsViewModel.tempTime = currentItem.time
            QuestsViewModel.tempState = currentItem.state

            it.findNavController().navigate(R.id.action_currentListFragment_to_updateQuest)
        }

    }

    override fun getItemCount(): Int {
        return questList.size
    }


    fun setData(quests : List<Quests>) {
        this.questList = quests
        notifyDataSetChanged()
    }

}