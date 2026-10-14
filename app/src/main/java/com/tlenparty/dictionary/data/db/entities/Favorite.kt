package com.tlenparty.dictionary.data.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.tlenparty.dictionary.helpers.consts.DB

@Entity(tableName = DB.TABLE_FAVORITE)
data class Favorite(
    @ColumnInfo(name = DB.SEARCH_DATA_ID)
    @PrimaryKey
    var searchDataId: Long? = null
)
