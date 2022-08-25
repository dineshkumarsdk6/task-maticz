package com.task.maticz.activity

import android.content.Context
import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import com.task.maticz.databinding.LayoutMobileBinding
import com.task.maticz.databinding.LayoutOtpBinding
import com.task.maticz.databinding.LayoutSplashScreenBinding
import com.task.maticz.databinding.LayoutUsernameBinding
import kotlinx.coroutines.*

class ActivityOtp : AppCompatActivity() {

    lateinit var binding: LayoutOtpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutOtpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textNext.setOnClickListener {
            val otp = "" + binding.appCompatEditText1.text!!.trim() + binding.appCompatEditText2.text!!.trim() + binding.appCompatEditText3.text!!.trim() +binding.appCompatEditText4.text!!.trim();
            if (otp.toString().length == 4){
                finishAffinity()
                val intent = Intent(this@ActivityOtp, ActivityBookCar::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this@ActivityOtp, "Enter 4 digit OTP", Toast.LENGTH_LONG).show()
            }

        }
        binding.imageViewBack.setOnClickListener {
            onBackPressed()
        }

        binding.appCompatEditText1.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                if (s.length == 1){
                    binding.appCompatEditText2.requestFocus()
                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }
        })

        binding.appCompatEditText2.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                if (s.length == 1){
                    binding.appCompatEditText3.requestFocus()
                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }
        })

        binding.appCompatEditText3.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                if (s.length == 1){
                    binding.appCompatEditText4.requestFocus()
                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }
        })

        binding.appCompatEditText4.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                if (s.length == 1){
                    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.showSoftInput(binding.appCompatEditText4, InputMethodManager.SHOW_IMPLICIT)
                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }
        })
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }


}