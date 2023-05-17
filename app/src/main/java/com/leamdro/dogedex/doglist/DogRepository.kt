package com.leamdro.dogedex.doglist

import com.leamdro.dogedex.Dog
import com.leamdro.dogedex.api.DogsApi.retrofitService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DogRepository {

    suspend fun dowloadDogs() : List<Dog>{
       return  withContext(Dispatchers.IO){
            val dogListApiResponse= retrofitService.getAllDogs()
           dogListApiResponse.data.dogs

        }
    }

}