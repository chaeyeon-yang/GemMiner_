package com.example.gemminer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.gemminer.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    lateinit var registerBinding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        registerBinding = ActivityRegisterBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(registerBinding.root)

        registerBinding.inputRegisterBtn.setOnClickListener {
            val loginIntent = Intent(this, HomeActivity::class.java)
            startActivity(loginIntent)
        }
    }
}