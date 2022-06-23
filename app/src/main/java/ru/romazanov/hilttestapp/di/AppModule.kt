package ru.romazanov.hilttestapp.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.romazanov.hilttestapp.data.AppDatabase
import ru.romazanov.hilttestapp.data.repository.LogAppRepository
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    @Singleton
    fun provideAppDatabase(app: Application): AppDatabase {
        return Room.databaseBuilder(
            app,
            AppDatabase::class.java,
            AppDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideLogRepository(db: AppDatabase): LogAppRepository {
        return LogAppRepository(db.logDao)
    }


}