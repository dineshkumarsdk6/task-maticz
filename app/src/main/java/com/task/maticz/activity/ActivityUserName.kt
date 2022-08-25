package com.task.maticz.activity

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.task.maticz.databinding.LayoutSplashScreenBinding
import com.task.maticz.databinding.LayoutUsernameBinding
import kotlinx.coroutines.*

class ActivityUserName : AppCompatActivity() {

    lateinit var binding: LayoutUsernameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutUsernameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textNext.setOnClickListener {
            if (binding.appCompatEditTextUserName.text.toString().isEmpty()){
                Toast.makeText(this@ActivityUserName, "Enter User Name", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val intent = Intent(this@ActivityUserName, ActivityMobile::class.java)
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