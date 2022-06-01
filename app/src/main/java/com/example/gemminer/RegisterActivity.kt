package com.example.gemminer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.gemminer.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    lateinit var registerBinding: ActivityRegisterBinding
    var DB:DBHelper?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        registerBinding = ActivityRegisterBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(registerBinding.root)
        DB = DBHelper(this)

        registerBinding.inputRegisterBtn.setOnClickListener {
            val user = registerBinding.inputNickname.text.toString()
            val pass = registerBinding.inputPassword.text.toString()
            val repass = registerBinding.reInputPassword.text.toString()
            if (user == "" || pass == "" || repass == "") Toast.makeText(
                this@RegisterActivity,
                "회원정보를 전부 입력해주세요.",
                Toast.LENGTH_SHORT
            ).show() else {
                if (pass == repass) {
                    val checkUsername = DB!!.checkUsername(user)
                    if (checkUsername == false) {
                        val insert = DB!!.insertData(user, pass)
                        if (insert == true) {
                            Toast.makeText(
                                this@RegisterActivity,
                                "가입되었습니다.",
                                Toast.LENGTH_SHORT
                            ).show()
                            val intent = Intent(applicationContext, MainActivity::class.java)
                            startActivity(intent)
                        } else {
                            Toast.makeText(
                                this@RegisterActivity,
                                "비밀번호가 일치하지 않습니다.",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    } else {
                        Toast.makeText(
                            this@RegisterActivity,
                            "이미 가입된 회원입니다.",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                } else {
                    Toast.makeText(this@RegisterActivity, "비밀번호가 일치하지 않습니디.", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }

    }
}