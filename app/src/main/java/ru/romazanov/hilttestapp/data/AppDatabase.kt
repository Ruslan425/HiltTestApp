package ru.romazanov.hilttestapp.data

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [Log::class],
    version = 1,
)
abstract class AppDatabase : RoomDatabase() {

    abstract val logDao: LogDao

    companion object{
        const val DATABASE_NAME = "log_db"
    }

}