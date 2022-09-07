package com.playlab.flowapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MainViewModel : ViewModel() {

    var languagesData: LiveData<String> = getLanguages().asLiveData()

    fun getLanguages() : Flow<String> {
        return flow {
            val languages = listOf(
                "Kotlin",
                "Java",
                "PHP",
                "C++",
                "C#",
                "Javascript",
                "Python"
            )

            for (language in languages){
                emit(language)
                delay(1000)
            }
        }
    }
}