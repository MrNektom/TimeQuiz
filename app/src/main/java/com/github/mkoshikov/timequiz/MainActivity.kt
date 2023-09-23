package com.github.mkoshikov.timequiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.github.mkoshikov.timequiz.ui.screen.navhost.QuizNavHost
import com.github.mkoshikov.timequiz.ui.theme.TimeQuizTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TimeQuizTheme {
                QuizNavHost()
            }
        }
    }
}