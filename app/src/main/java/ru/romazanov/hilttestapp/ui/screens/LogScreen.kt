package ru.romazanov.hilttestapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.romazanov.hilttestapp.MainViewModel

@Composable
fun LogScreen(
    viewModel: MainViewModel
) {
    val list = viewModel.list
    Scaffold() {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(list) { item ->
                Column(
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                ) {
                    Text(item.time)
                    Text(text = item.msg)
                }
            }
        }
    }
}