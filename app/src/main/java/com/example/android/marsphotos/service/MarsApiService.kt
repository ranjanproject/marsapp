package com.example.android.marsphotos.service

import com.example.android.marsphotos.models.MarsData
import retrofit2.http.GET

interface MarsApiService {
    @GET("photos")
    suspend fun getImages(): MarsData
}