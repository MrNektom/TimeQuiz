package com.github.mkoshikov.timequiz.ui.screen.navhost

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.github.mkoshikov.timequiz.ui.screen.start.START_DESTINATION
import com.github.mkoshikov.timequiz.ui.screen.start.StartScreen

@Composable
fun QuizNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = START_DESTINATION) {
        composable(START_DESTINATION) {
            StartScreen(
                onStart = {}
            )
        }
    }
}