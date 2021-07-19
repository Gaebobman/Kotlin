package com.example.android.unscramble.ui.game

import androidx.lifecycle.ViewModel

class GameViewModel: ViewModel() {

    private var score = 0
    private var currentWordCount = 0
    private var currentScrambledWord = "test"


    override fun onCleared() {
        super.onCleared()
    }

    override fun <T : Any?> setTagIfAbsent(key: String?, newValue: T): T {
        return super.setTagIfAbsent(key, newValue)
    }

    override fun <T : Any?> getTag(key: String?): T {
        return super.getTag(key)
    }
}