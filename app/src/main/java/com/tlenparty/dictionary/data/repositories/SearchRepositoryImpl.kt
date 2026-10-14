package com.tlenparty.dictionary.data.repositories

import com.tlenparty.dictionary.api.DictionaryApi
import com.tlenparty.dictionary.data.entities.SearchData

class SearchRepositoryImpl(private val dictionaryApi: DictionaryApi) : SearchRepository {

    override suspend fun search(word: String): List<SearchData> = dictionaryApi.search(word).await()
}