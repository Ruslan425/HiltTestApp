package ru.romazanov.hilttestapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.romazanov.hilttestapp.ui.screens.FirstScreen
import ru.romazanov.hilttestapp.ui.screens.LogScreen

@Composable
fun Navigation(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = Screen.FirstScreen.rout) {
        composable(Screen.FirstScreen.rout) {
            FirstScreen(navHostController)
        }
        composable(Screen.LogScreen.rout) {
            LogScreen()
        }
    }

}