package com.example.gemminer

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gemminer.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var loginBinding: ActivityMainBinding
    var DB:DBHelper?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        loginBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(loginBinding.root)
        DB = DBHelper(this)

        loginBinding.loginBtn!!.setOnClickListener {
            val user = loginBinding.nickname!!.text.toString()
            val pass = loginBinding.password!!.text.toString()
            if (user ==""|| pass=="") Toast.makeText(
                this@MainActivity,
                "회원정보를 전부 입력해주세요",
                Toast.LENGTH_SHORT
            ).show() else{
                val checkUserpass = DB!!.checkUserpass(user, pass)
                if (checkUserpass ==true){
                    Toast.makeText(this@MainActivity, "로그인 되었습니다.", Toast.LENGTH_SHORT)
                        .show()
                    val intent = Intent(applicationContext, HomeActivity::class.java)
                    startActivity(intent)
                }
                else {
                    Toast.makeText(this@MainActivity, "회원정보가 존재하지 않습니다.", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }
        loginBinding.registerBtn.setOnClickListener {
            val loginIntent = Intent(this@MainActivity, RegisterActivity::class.java)
            startActivity(loginIntent)
        }
    }
}