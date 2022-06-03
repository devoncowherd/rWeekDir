package com.example.questr.fragments

import android.app.*
import android.content.Context
import android.content.Context.ACCESSIBILITY_SERVICE
import android.content.Context.NOTIFICATION_SERVICE
import android.content.Intent
import android.icu.util.Calendar
import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.questr.R
import com.example.questr.data.Quests
import com.example.questr.data.QuestsAdapter
import com.example.questr.data.QuestsViewModel
import com.example.questr.databinding.ActivityMainBinding
import com.example.questr.databinding.FragmentAddListBinding
import com.example.questr.notifications.*
import kotlinx.android.synthetic.main.fragment_add_list.*
import kotlinx.android.synthetic.main.fragment_add_list.view.*
import kotlinx.android.synthetic.main.fragment_current_list.view.*
import java.util.*


class AddListFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add_list, container, false)
        //notifications

        //insert quest

        view.cancel_add.setOnClickListener {
            view.findNavController().navigate(R.id.action_addListFragment_to_currentListFragment)
            Toast.makeText(requireContext(), "Quest Cancelled", Toast.LENGTH_SHORT).show()
        }

        view.add_quest.setOnClickListener {
            insertQuest(view)
        }

        return view
    }


    fun insertQuest(view : View) {
        if(checkInput()) {
            view.findNavController().navigate(R.id.action_addListFragment_to_currentListFragment)
            val title = add_quest_name.text.toString()
            val description = add_quest_description.text.toString()
            val date = "${add_date.year}-${add_date.month}-${add_date.dayOfMonth}"
            val time = "${add_time.hour}:${add_time.minute}"
            val quest = Quests(0, title, description, date, time, false)
            //val vm = ViewModelProvider(this).get(QuestsViewModel::class.java)
            val vm : QuestsViewModel by viewModels()
            vm.addQuest(quest)
            createNotificationChannel(title, description)
            scheduleNotification()
            Toast.makeText(requireContext(), "Quest Added!", Toast.LENGTH_LONG).show()

        } else {
            Toast.makeText(requireContext(), "Please fill all input boxes appropriately", Toast.LENGTH_LONG).show()
        }
    }

    fun checkInput() : Boolean {
        if(!(TextUtils.isEmpty(view?.add_quest_name?.text) || TextUtils.isEmpty(view?.add_quest_description?.text))) {
            return true
        }
        return false
    }

    private fun createNotificationChannel(_name : String, _description : String) {
        val name = _name
        val description = _description
        val importance = NotificationManager.IMPORTANCE_DEFAULT
        val channel = NotificationChannel(CHANNEL_ID, name, importance)
        channel.description = description
        val notificationManager = getActivity()?.getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(channel)
    }

    private fun scheduleNotification() {
            val vm = ViewModelProvider(this).get(QuestsViewModel::class.java)
            val intent = Intent(vm.app, Notification::class.java)
            //lateinit var binding : FragmentAddListBinding

            //https://developer.android.com/topic/libraries/view-binding
            //val binding = FragmentAddListBinding.inflate(layoutInflater)
            val title =  add_quest_name.text.toString()
            val message = add_quest_description.text.toString()

            intent.putExtra(TITLE_EXTRA, title)
            intent.putExtra(MESSAGE_EXTRA, message)

            val pendingIntent = PendingIntent.getBroadcast(
                vm.app,
                NOTIFICATION_ID,
                intent,
                PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
            )

            val alarmManager = getActivity()?.getSystemService(Context.ALARM_SERVICE) as AlarmManager
            val time = getTime()
            alarmManager.setExactAndAllowWhileIdle(
                AlarmManager.RTC_WAKEUP,
                time,
                pendingIntent
            )

            showAlert(time, title, message)
    }

    private fun showAlert(time: Long, title: String, message: String) {
        val vm = ViewModelProvider(this).get(QuestsViewModel::class.java)
        val date = Date(time)
        val dateFormat = android.text.format.DateFormat.getLongDateFormat((vm.app))
        val timeFormat = android.text.format.DateFormat.getTimeFormat((vm.app))

        AlertDialog.Builder(requireContext())
            .setTitle("Notification Scheduled")
            .setMessage(
                "Title: " + title +
                "\nMessage: " + message +
                "\nnAt: " + dateFormat.format(date) + " " + timeFormat.format(date)
            ).setPositiveButton("Okay"){_,_ ->}
            .show()
    }

    private fun getTime() : Long {
        val minute = add_time.minute
        val hour = add_time.hour
        val day = add_date.dayOfMonth
        val month = add_date.month
        val year = add_date.year

        val calendar = Calendar.getInstance()
        calendar.set(year, month, day, hour, minute)
        return calendar.timeInMillis
    }


}

