package com.example.questr.fragments

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.text.TextUtils
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.questr.R
import com.example.questr.data.Quests
import com.example.questr.data.QuestsAdapter
import com.example.questr.data.QuestsViewModel
import kotlinx.android.synthetic.main.fragment_update_quest.*
import kotlinx.android.synthetic.main.fragment_update_quest.view.*

class UpdateListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_update_quest, container, false)

        val vm : QuestsViewModel by viewModels()

        view.update_quest_name.setText(QuestsViewModel.tempTitle)
        view.update_quest_description.setText(QuestsViewModel.tempDescription)


        //vm.deleteQuest(quests)
        //trash quest functionality
        setHasOptionsMenu(true)
        val builder = AlertDialog.Builder(requireContext())
        builder.setMessage("Are you sure you want to delete this quest?")
        builder.setTitle("Delete Quest")
        builder.setPositiveButton("Yes", { dialogInterface : DialogInterface, i : Int ->
            val quests = selectQuest(vm)
            vm.deleteQuest(quests)
            Toast.makeText(requireContext(), "Quest Deleted!", Toast.LENGTH_LONG).show()
            view?.findNavController()!!.navigate(R.id.action_updateQuest_to_currentListFragment)
        })

        builder.setNegativeButton("Nevermind") { dialogInterface : DialogInterface, i : Int ->

        }


        view.trash_update.setOnClickListener {
            builder.show()
        }

        //cancel update functionality
        view.cancel_update.setOnClickListener {
            Toast.makeText(requireContext(), "Update Cancelled!", Toast.LENGTH_LONG).show()
            view?.findNavController()!!.navigate(R.id.action_updateQuest_to_currentListFragment)

        }

        view.update_quest.setOnClickListener {
            if(checkInput()) {
                updateQuest()
            }
        }

        return view
    }

    private fun updateQuest() {
        val title = update_quest_name.text.toString()
        val description = update_quest_description.text.toString()
        val state = QuestsViewModel.tempState
        val id = QuestsViewModel.tempID
        val date = QuestsViewModel.tempDate
        val time = QuestsViewModel.tempTime

        Toast.makeText(requireContext(),"Quest Updated!" , Toast.LENGTH_LONG).show()

        val updatedQuest = Quests(id, title, description, date, time,state)
        val vm = ViewModelProvider(this).get(QuestsViewModel::class.java)
        vm.updateQuest(updatedQuest)


        val adapter = QuestsAdapter()
        adapter.notifyDataSetChanged()

        view?.findNavController()!!.navigate(R.id.action_updateQuest_to_currentListFragment

        )
    }

    private fun checkInput() : Boolean {
        if(!(TextUtils.isEmpty(view?.update_quest_name?.text) || TextUtils.isEmpty(view?.update_quest_description?.text))) {
            return true
        }
        Toast.makeText(requireContext(), "Please fill all input boxes appropriately", Toast.LENGTH_LONG).show()
        return false
    }

    fun selectQuest(vm : ViewModel) : Quests {
        val id = QuestsViewModel.tempID
        val title = QuestsViewModel.tempTitle
        val description = QuestsViewModel.tempDescription
        val date = QuestsViewModel.tempDate
        val time = QuestsViewModel.tempTime
        val state = false

        val quests = Quests(id,title,description,date,time,false)

        return quests
    }

}