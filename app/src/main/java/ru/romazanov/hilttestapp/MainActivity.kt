package ru.romazanov.hilttestapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import ru.romazanov.hilttestapp.ui.navigation.Screen
import ru.romazanov.hilttestapp.ui.screens.FirstScreen
import ru.romazanov.hilttestapp.ui.screens.LogScreen
import ru.romazanov.hilttestapp.ui.theme.HiltTestAppTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HiltTestAppTheme {
                val navHostController = rememberNavController()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
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
            }
        }
    }
}
