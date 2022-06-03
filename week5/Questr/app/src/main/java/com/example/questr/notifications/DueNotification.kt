package com.example.questr.notifications

import android.app.Notification
import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat
import com.example.questr.R


val NOTIFICATION_ID = 1
val CHANNEL_ID = "channel1"
val TITLE_EXTRA = "titleExtra"
val MESSAGE_EXTRA = "messageExtra"

class DueNotification : BroadcastReceiver() {

    override fun onReceive(context : Context, intent : Intent) {
        val notification : Notification = NotificationCompat.Builder(context, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentTitle(intent.getStringExtra(TITLE_EXTRA))
            .setContentText(intent.getStringExtra(MESSAGE_EXTRA))
            .build()

        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.notify(NOTIFICATION_ID, notification)
    }
}