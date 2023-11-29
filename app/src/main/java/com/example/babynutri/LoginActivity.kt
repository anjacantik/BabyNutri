package com.example.babynutri

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    private lateinit var btnbacklogin: ImageView
    private lateinit var L_button2: Button
    private lateinit var txt_signup: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        btnbacklogin = findViewById(R.id.btnbacklogin)
        L_button2 = findViewById(R.id.L_button2)
        txt_signup = findViewById(R.id.txt_signup)

        btnbacklogintomenupage()
        btntohomepage()
        btntosignuppage()
    }

    private fun btnbacklogintomenupage() {
        btnbacklogin.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun btntosignuppage() {
        txt_signup.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }

    private fun btntohomepage(){
        L_button2.setOnClickListener{
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}