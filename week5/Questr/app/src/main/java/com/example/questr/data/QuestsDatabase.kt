package com.example.questr.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Quests::class], version = 1, exportSchema = false)
abstract class QuestsDatabase : RoomDatabase() {
    abstract fun questDao() : QuestsDao


    companion object {

        @Volatile
        var INSTANCE : QuestsDatabase? = null
        val tempInstance = INSTANCE

        fun getDatabase(context : Context) : QuestsDatabase{
            if(tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    QuestsDatabase::class.java,
                    "quests_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }

}