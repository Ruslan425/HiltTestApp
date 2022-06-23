package ru.romazanov.hilttestapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import ru.romazanov.hilttestapp.MainViewModel
import ru.romazanov.hilttestapp.ui.navigation.Screen
import androidx.hilt.navigation.compose.hiltViewModel
import kotlinx.coroutines.launch


@Composable
fun FirstScreen(
    navHostController: NavHostController,
    viewModel: MainViewModel
) {

    val scope = rememberCoroutineScope()
    Scaffold {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Button(onClick = { viewModel.button1() }) {
                Text(text = "Button 1")
            }
            Button(onClick = {viewModel.button2() }) {
                Text(text = "Button 2")
            }
            Button(onClick = {viewModel.button3() }) {
                Text(text = "Button 3")
            }

            Spacer(modifier = Modifier.padding(80.dp))

            Button(onClick = { viewModel.deleteAll()}) {
                Text(text = "Delete log")
            }

            Button(onClick = {
                scope.launch {
                    viewModel.getAll()
                }
                navHostController.navigate(Screen.LogScreen.rout)
            }) {
                Text(text = "See log")
            }

        }
    }
}