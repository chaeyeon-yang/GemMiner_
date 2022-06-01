package com.example.gemminer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_home)
    }

    override fun onSupportNavigateUp(): Boolean {
        val TAG="Debug"
        Log.d(TAG, "Up Clicked")
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}