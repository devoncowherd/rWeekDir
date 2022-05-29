package com.example.myfirstroom

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "students")
data class Students(@PrimaryKey(autoGenerate = true)var studentId: Int?,
                    @ColumnInfo(name = "firstname")var firstName: String?,
                    @ColumnInfo(name = "lastname")var lastName: String?){

}

