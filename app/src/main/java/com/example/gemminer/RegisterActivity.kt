package com.example.gemminer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gemminer.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    var registerBinding = ActivityRegisterBinding.inflate(layoutInflater)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }
}