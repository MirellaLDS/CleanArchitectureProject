package com.example.mlds.cleanarchitectureproject.infraestruture.helper

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitHelper {

    private const val DEFAULT_TIMEOUT = 60L

    fun createRetrofit(endPoint: String, timeout: Long = DEFAULT_TIMEOUT): Retrofit {
        return Retrofit.Builder()
            .baseUrl(endPoint)
            .addConverterFactory(MoshiConverterFactory.create())
            .client(OkHttpClient.Builder()
                .readTimeout(timeout, TimeUnit.SECONDS)
                .connectTimeout(timeout, TimeUnit.SECONDS)
                .build())
            .build()
    }
}