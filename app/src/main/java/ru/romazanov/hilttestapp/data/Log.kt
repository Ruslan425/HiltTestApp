package ru.romazanov.hilttestapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "logs")
data class Log(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val msg: String,
    val time: String,
)
