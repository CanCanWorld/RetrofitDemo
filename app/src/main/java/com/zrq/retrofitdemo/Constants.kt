package com.zrq.retrofitdemo

object Constants {

    const val BASE_URL = "http://service.picasso.adesk.com"

    const val GET_PIC = "/v1/vertical/category/"

    const val GET_CATEGORY = "/v1/vertical/category?adult=false&first=1"

    fun getPicByCategory(category: String, limit: Int, num: Int): String {
        return "$BASE_URL$GET_PIC$category/vertical?limit=$limit&skip=${num * limit}&adult=false&first=0&order=hot\""
    }

}