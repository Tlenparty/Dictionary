package com.tlenparty.dictionary.data.db.DAO

import androidx.room.*
import com.tlenparty.dictionary.data.db.entities.MeaningDB

@Dao
interface MeaningDao {
    // созранить найденные переводы слова
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(meanings: List<MeaningDB>)
}