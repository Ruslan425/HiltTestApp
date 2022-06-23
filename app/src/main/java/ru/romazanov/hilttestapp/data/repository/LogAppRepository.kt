package ru.romazanov.hilttestapp.data.repository

import ru.romazanov.hilttestapp.data.Log
import ru.romazanov.hilttestapp.data.LogDao

class LogAppRepository(
    private val dao: LogDao
) {
    suspend fun getAll(): List<Log> {
        return dao.getAll()
    }

    suspend fun insertAll(log: Log) {
        dao.insertAll(log)
    }

    suspend fun deleteAll() {
        dao.deleteAll()
    }
}