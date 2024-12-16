package com.samarbaeffruslan.tetris.base

import android.content.Context

private const val APP_PREFS = "APP_PREFERENCES"
private const val HIGH_SCORE = "HIGH_SCORE"
private const val DEFAULT_SCORE = 0

class AppPreferences(context: Context) {

    private val prefs = context.getSharedPreferences(
        APP_PREFS,
        Context.MODE_PRIVATE
    )

    fun saveHighScore(highScore: Int) {
        prefs.edit().putInt(HIGH_SCORE, highScore).apply()
    }

    fun getHighScore(): Int {
        return prefs.getInt(HIGH_SCORE, 0)
    }

    fun clearScore() {
        prefs.edit().putInt(HIGH_SCORE, DEFAULT_SCORE).apply()
    }
}