package com.task.maticz.activity

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.task.maticz.databinding.LayoutMobileBinding
import com.task.maticz.databinding.LayoutSplashScreenBinding
import com.task.maticz.databinding.LayoutUsernameBinding
import kotlinx.coroutines.*

class ActivityMobile : AppCompatActivity() {

    lateinit var binding: LayoutMobileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutMobileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textNext.setOnClickListener {
            if (binding.appCompatEditTextMobile.text.toString().isEmpty()){
                Toast.makeText(this@ActivityMobile, "Enter Mobile Number", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val intent = Intent(this@ActivityMobile, ActivityPassword::class.java)
            startActivity(intent)
        }
        binding.imageViewBack.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }


}