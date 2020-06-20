package com.example.androidroomexample.datarepository

import androidx.lifecycle.LiveData
import com.example.androidroomexample.dao.WordDao
import com.example.androidroomexample.model.Word

class WordRepository(private val wordDao: WordDao) {

    val allWords: LiveData<List<Word>> = wordDao.getAlphabetizedWords()

    suspend fun insert(word: Word){
        wordDao.insert(word)
    }
}