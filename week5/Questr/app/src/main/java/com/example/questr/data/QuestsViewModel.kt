package com.example.questr.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class QuestsViewModel(_application : Application) : AndroidViewModel(_application) {

    val app = _application
    val getAllQuests : LiveData<List<Quests>>
    private val questRepository : QuestRepository

    companion object {
        var tempTitle: String = ""
        var tempDescription : String = ""
        var tempID : Int = 0
        var tempDate : String = ""
        var tempTime  : String = ""
        //true = complete , false = incomplete
        var tempState : Boolean = false

    }

    init {
        val questDao = QuestsDatabase.getDatabase(app).questDao()
        questRepository = QuestRepository(questDao)
        getAllQuests = questRepository.getAllQuests
    }

    fun addQuest(quests : Quests) {
        viewModelScope.launch(Dispatchers.IO) {
            questRepository.addQuest(quests)
        }
    }

    fun updateQuest(quests : Quests) {
        viewModelScope.launch(Dispatchers.IO) {
            questRepository.updateQuest(quests)
        }
    }

    fun deleteQuest(quests : Quests) {
        viewModelScope.launch(Dispatchers.IO) {
            questRepository.deleteQuest(quests)
        }
    }

}