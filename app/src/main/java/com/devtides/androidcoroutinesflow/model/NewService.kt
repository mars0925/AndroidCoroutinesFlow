package com.devtides.androidcoroutinesflow.model

import retrofit2.http.GET


//API:https://raw.githubusercontent.com/DevTides/NewsApi/master/news.json
interface NewService {
    @GET("news.json")
    suspend fun getNews():List<NewsArticle>
}