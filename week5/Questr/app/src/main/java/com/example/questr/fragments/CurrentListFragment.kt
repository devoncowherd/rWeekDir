package com.example.questr.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.questr.R
import com.example.questr.data.Quests
import com.example.questr.data.QuestsAdapter
import com.example.questr.data.QuestsViewModel
import kotlinx.android.synthetic.main.fragment_current_list.view.*

class CurrentListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_current_list, container, false)
        val vm: QuestsViewModel by viewModels()
        val recyclerView = view.recycler_view
        val adapter = QuestsAdapter()

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        vm.getAllQuests.observe(viewLifecycleOwner, Observer { quests ->
            adapter.setData(quests)
            checkListSize(view, adapter)
        })

/*        ItemTouchHelper(object : ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT){
            override fun onMove (
                recyclerView : RecyclerView,
                viewHolder :RecyclerView.ViewHolder,
                target : RecyclerView.ViewHolder
            ) : Boolean (
              return false
            )
        })*/


        view.add_fab.setOnClickListener {
            view.findNavController().navigate(R.id.action_currentListFragment_to_addListFragment)
        }

        return view
    }


    fun checkListSize(view : View, adapter: QuestsAdapter) {

        var questList = adapter.questList

        if(questList.isEmpty()) {
            view.tumbleweed.visibility = View.VISIBLE
            view.empty_message.visibility = View.VISIBLE

        } else {
            view.tumbleweed.visibility = View.INVISIBLE
            view.empty_message.visibility = View.INVISIBLE
        }
    }
}