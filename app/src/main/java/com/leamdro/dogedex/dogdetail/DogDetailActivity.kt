package com.leamdro.dogedex.dogdetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.leamdro.dogedex.databinding.ActivityDogDetailBinding

class DogDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding  = ActivityDogDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}