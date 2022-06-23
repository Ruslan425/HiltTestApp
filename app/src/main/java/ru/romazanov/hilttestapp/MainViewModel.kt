package ru.romazanov.hilttestapp

import android.annotation.SuppressLint
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import ru.romazanov.hilttestapp.data.Log
import ru.romazanov.hilttestapp.data.repository.LogAppRepository
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: LogAppRepository
) : ViewModel() {

    var logList by mutableStateOf(listOf<Log>())


    private fun getTime(): String {
        @SuppressLint("SimpleDateFormat")
        val sdf = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
        return sdf.format(Date())
    }

    fun button1() {
        viewModelScope.launch {
            repository.insertAll(Log(msg = "Button1", time = getTime()))
        }
    }

    fun button2() {
        viewModelScope.launch {
            repository.insertAll(Log(msg = "Button2", time = getTime()))
        }
    }

    fun button3() {
        viewModelScope.launch {
            repository.insertAll(Log(msg = "Button3", time = getTime()))
        }
    }

    fun deleteAll() {
        viewModelScope.launch {
            repository.deleteAll()
        }
    }

    fun getAll() {
        viewModelScope.launch {
            logList = repository.getAll()
        }
    }

}