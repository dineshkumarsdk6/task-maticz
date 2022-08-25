package com.task.maticz.activity

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.task.maticz.databinding.LayoutPasswordBinding
import com.task.maticz.databinding.LayoutSplashScreenBinding
import com.task.maticz.databinding.LayoutUsernameBinding
import kotlinx.coroutines.*

class ActivityPassword : AppCompatActivity() {

    lateinit var binding: LayoutPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textNext.setOnClickListener {
            if (binding.appCompatEditTextPassword.text.toString().isEmpty()){
                Toast.makeText(this@ActivityPassword, "Enter Password", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val intent = Intent(this@ActivityPassword, ActivityOtp::class.java)
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