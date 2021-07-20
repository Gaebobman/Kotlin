package com.example.android.unscramble.ui.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {



    private var _score = 0
    val score: Int
        get() = _score

    private var _currentWordCount = 0
    val currentWordCount: Int
        get() = _currentWordCount

    private lateinit var _currentScrambledWord: String

    private var wordsList: MutableList<String> = mutableListOf()
    private lateinit var currentWord: String

    // 읽기전용; 다른 클래스에서는 _currentScrambledWord을 읽기'만' 가능함
    val currentScrambledWord: String
        get() = _currentScrambledWord

    override fun onCleared() {
        super.onCleared()
        Log.d("GameFragment", "GameViewModel destroyed!")
    }

    init {
        Log.d("GameFragment", "GameViewModel created!")
        getNextWord()
    }

    private fun getNextWord(){
        currentWord = allWordsList.random()
        val tempWord = currentWord.toCharArray()
        tempWord.shuffle()
        Log.d("GameFragment", "currentWord= $currentWord")
        while(String(tempWord).equals(currentWord, false)){
            tempWord.shuffle()
        }

        if(wordsList.contains(currentWord)){
            getNextWord()
        }else{
            _currentScrambledWord = String(tempWord)
            ++_currentWordCount
            wordsList.add(currentWord)
        }
    }
    fun nextWord():Boolean {
        return if (_currentWordCount < MAX_NO_OF_WORDS){
            getNextWord()
            true
        }else false
    }
    private fun increaseScore(){
        _score += SCORE_INCREASE
    }

    fun isUserWordCorrect(playerWord: String): Boolean{
        if(playerWord.equals(currentWord, true)){
            increaseScore()
            return true
        }
        return false
    }

    fun reinitializeData(){
        _score = 0
        _currentWordCount = 0
        wordsList.clear()
        getNextWord()
    }

}