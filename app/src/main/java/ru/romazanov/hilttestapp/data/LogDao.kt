package ru.romazanov.hilttestapp.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface LogDao {

    @Query("SELECT * FROM logs ORDER BY id DESC")
    fun getAll(): List<Log>

    @Insert
    suspend fun insertAll(log: Log)

    @Query("DELETE FROM logs")
    suspend fun deleteAll()

}