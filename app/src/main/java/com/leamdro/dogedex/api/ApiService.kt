package com.leamdro.dogedex.api

import com.leamdro.dogedex.BASE_URL
import com.leamdro.dogedex.Dog
import com.leamdro.dogedex.GET_ALL_DOGS_URL
import com.leamdro.dogedex.api.responses.DogListApiResponse
import com.leamdro.dogedex.api.responses.DogListResponse
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private val retrofit = Retrofit.Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(MoshiConverterFactory.create())
    .build()

interface ApiService {
    @GET(GET_ALL_DOGS_URL)
    suspend fun getAllDogs():DogListApiResponse
}
object DogsApi{
    val retrofitService : ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}