package com.tlenparty.dictionary.di.module

import androidx.room.Room
import com.tlenparty.dictionary.base_logic.search.adapter.SearchDataRVAdapter
import com.tlenparty.dictionary.data.db.AppDB
import com.tlenparty.dictionary.data.interactors.SearchInteractor
import com.tlenparty.dictionary.data.interactors.SearchInteractorImpl
import com.tlenparty.dictionary.data.repositories.SearchRepository
import com.tlenparty.dictionary.data.repositories.SearchRepositoryImpl
import com.tlenparty.dictionary.helpers.consts.DB
import com.tlenparty.dictionary.helpers.consts.Scopes
import com.tlenparty.dictionary.data.db.entities.Favorite
import com.tlenparty.dictionary.viewmodel.FavoriteViewModel
import com.tlenparty.dictionary.viewmodel.SearchDetailViewModel
import com.tlenparty.dictionary.viewmodel.SearchViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

object KoinModules {

    //модуль, содержмое которого должно быть во всем приложении
    val application = module {
        single<SearchRepository>() { SearchRepositoryImpl(dictionaryApi = get(qualifier = named(Scopes.API_MODULE))) }
        single<AppDB> { Room.databaseBuilder(get(), AppDB::class.java, DB.NAME).build() }
        single{get<AppDB>().searchHistoryDao()}
    }

    //модуль окна с поиском слова
    val searchModule = module {
        factory<SearchInteractor> { SearchInteractorImpl(searchRepository = get()) }
        viewModel(qualifier = named(Scopes.SEARCH_VIEW_MODEL)) { SearchViewModel(searchInteractor = get(), db = get()) }
        factory<SearchDataRVAdapter> { SearchDataRVAdapter() }
    }

    //модуль окна с детализацией найденного слова
    val searchDetailModule = module {
        viewModel(qualifier = named(Scopes.SEARCH_DETAIL_VIEW_MODEL)) { SearchDetailViewModel(db = get()) }
    }

    //модуль окна с избранными словами
    val favoriteModule = module {
        viewModel(qualifier = named(Scopes.FAVORITE_VIEW_MODEL)) { FavoriteViewModel(db = get()) }
    }
}