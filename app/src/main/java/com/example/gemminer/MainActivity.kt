package com.example.gemminer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.gemminer.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var loginBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        loginBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(loginBinding.root)


        loginBinding.registerBtn.setOnClickListener {
            val RegisterIntent = Intent(this@MainActivity, RegisterActivity::class.java)
            startActivity(RegisterIntent)
        }

        loginBinding.loginBtn.setOnClickListener {
            val loginIntent = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(loginIntent)
        }
    }
}