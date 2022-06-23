package ru.romazanov.hilttestapp.ui.navigation

open class Screen(val rout: String) {
    object FirstScreen: Screen(rout = "first_screen")
    object LogScreen: Screen(rout = "log_screen")
}