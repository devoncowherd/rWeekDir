package com.example.questr.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "quest_table")
data class Quests(@PrimaryKey(autoGenerate = true) var id : Int,
                  var title : String,
                  var description : String,
                  var date : String,
                  var time : String,
                  var state : Boolean) : Parcelable
