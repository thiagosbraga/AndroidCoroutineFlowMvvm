package com.devtides.androidcoroutinesflow.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.devtides.androidcoroutinesflow.model.NewsRepository
import com.devtides.androidcoroutinesretrofit.model.NewsArticle

class ListViewModel: ViewModel() {

    val newsArticles = NewsRepository().getNewsArticle().asLiveData()

}