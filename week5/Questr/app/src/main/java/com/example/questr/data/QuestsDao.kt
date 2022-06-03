package com.example.questr.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface QuestsDao {

    @Query("SELECT * FROM quest_table ORDER BY id ASC")
    fun getAllQuests() : LiveData<List<Quests>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addQuest(quests : Quests)

    @Update
    fun updateQuest(quests : Quests)

    //https://developer.android.com/reference/androidx/room/Delete
    @Delete(entity = Quests::class)
    fun deleteQuest(vararg quests : Quests)

}