package com.zrq.retrofitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val picService = ServiceCreator.create(PicService::class.java)
        picService.getCategory().enqueue(object : Callback<Picture> {
            override fun onResponse(call: Call<Picture>, response: Response<Picture>) {
                Log.d("TAG", "onResponse: ${response.body().toString()}")
            }

            override fun onFailure(call: Call<Picture>, t: Throwable) {
            }

        })

        GlobalScope.launch(Dispatchers.Main) {
            val string = NetworkRequest.getCategory().res.toString()
            Log.d(TAG, "onCreate: $string")
        }

    }

    companion object {
        const val TAG = "MainActivity"
    }

}