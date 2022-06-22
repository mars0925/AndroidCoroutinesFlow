package com.devtides.androidcoroutinesflow.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.devtides.androidcoroutinesflow.model.NewRepository

class ListViewModel : ViewModel() {
    val newsArticles = NewRepository().getNewsArticles().asLiveData()
}