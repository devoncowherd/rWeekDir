package com.example.questr

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_current_list.view.*

class CurrentListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_current_list, container, false)

        view.add_fab.setOnClickListener {
            view.findNavController().navigate(R.id.action_currentListFragment_to_addListFragment)
        }

        return view
    }

}