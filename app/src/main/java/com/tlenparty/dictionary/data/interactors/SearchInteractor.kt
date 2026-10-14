package com.tlenparty.dictionary.data.interactors

import com.tlenparty.dictionary.data.entities.SearchData
import io.reactivex.Single

interface SearchInteractor {
    //выполнить перевод слова
    suspend fun search(word: String): List<SearchData>
}