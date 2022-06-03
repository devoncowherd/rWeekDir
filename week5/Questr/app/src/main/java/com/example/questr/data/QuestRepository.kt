package com.example.questr.data

import androidx.lifecycle.LiveData

class QuestRepository(val questsDao : QuestsDao) {

    val getAllQuests : LiveData<List<Quests>> = questsDao.getAllQuests()

    fun addQuest(quests : Quests) {
        questsDao.addQuest(quests)
    }

    fun updateQuest(quests : Quests) {
        questsDao.updateQuest(quests)
    }

    fun deleteQuest(quests : Quests) {
        questsDao.deleteQuest(quests)
    }
}