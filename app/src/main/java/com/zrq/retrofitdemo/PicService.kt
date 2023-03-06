package com.zrq.retrofitdemo

import retrofit2.Call
import retrofit2.http.GET

interface PicService {

    @GET("/v1/vertical/category?adult=false&first=1")
    fun getCategory() : Call<Picture>

}