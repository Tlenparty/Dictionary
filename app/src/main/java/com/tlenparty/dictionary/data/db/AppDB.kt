package com.tlenparty.dictionary.data.db

import androidx.room.*
import com.tlenparty.dictionary.data.db.DAO.*
import com.tlenparty.dictionary.data.db.entities.*
import com.tlenparty.dictionary.helpers.consts.DB

@Database(
    entities = [
        SearchHistory::class
//        SearchDataDB::class,
//        MeaningDB::class,
//        Favorite::class
    ], version = DB.VERSION, exportSchema = false
)
abstract class AppDB : RoomDatabase() {
    abstract fun searchHistoryDao(): SearchHistoryDao
//    abstract fun searchDataDao(): SearchDataDao
//    abstract fun meaningDao(): MeaningDao
//    abstract fun favoriteDao(): FavoriteDao
}