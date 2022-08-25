package com.task.maticz.activity

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.task.maticz.databinding.LayoutBookCarBinding
import com.task.maticz.databinding.LayoutSplashScreenBinding
import com.task.maticz.databinding.LayoutUsernameBinding
import kotlinx.coroutines.*

class ActivityBookCar : AppCompatActivity() {

    lateinit var binding: LayoutBookCarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutBookCarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageViewBack.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }


}