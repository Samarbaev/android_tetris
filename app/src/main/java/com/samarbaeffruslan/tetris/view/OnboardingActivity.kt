package com.samarbaeffruslan.tetris.view

import android.content.Intent
import android.os.Bundle
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import by.kirich1409.viewbindingdelegate.viewBinding
import com.samarbaeffruslan.tetris.base.BaseActivity
import com.samarbaeffruslan.tetris.R
import com.samarbaeffruslan.tetris.base.AppPreferences
import com.samarbaeffruslan.tetris.databinding.ActivityOnboardingBinding
import kotlin.system.exitProcess

class OnboardingActivity : BaseActivity(R.layout.activity_onboarding) {

    private val viewBinding by viewBinding(
        ActivityOnboardingBinding::bind,
        R.id.onboardingContainer
    )

    private val appPrefs by lazy {
        AppPreferences(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.onboardingContainer)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        with(viewBinding) {
            btnNewGame.setOnClickListener {
                onButtonNewGameClick()
            }

            btnResetScore.setOnClickListener {
                onButtonNewGameClick()
            }

            btnExit.setOnClickListener {
                onButtonExitClick()
            }
        }
    }

    private fun onButtonNewGameClick() {
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
    }

    private fun onButtonResetScoreClick() {
    }

    private fun onButtonExitClick() {
        exitProcess(0)
    }
}