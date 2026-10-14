package com.tlenparty.dictionary.data.repositories

import com.tlenparty.dictionary.data.entities.SearchData
import io.reactivex.Single

interface SearchRepository {
    //выполнить перевод слова
    suspend fun search(word: String): List<SearchData>
}