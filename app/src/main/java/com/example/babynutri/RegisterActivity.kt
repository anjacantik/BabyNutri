package com.example.babynutri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {

    private lateinit var btnbackregister: ImageView
    private lateinit var R_button2: Button
    private lateinit var txt_login: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        btnbackregister = findViewById(R.id.btnbackregister)
        R_button2 = findViewById(R.id.R_button2)
        txt_login = findViewById(R.id.txt_login)

        btnbackregistertomenupage()
        btntologinpage()
        btntologinpagetxt()

    }

    private fun btnbackregistertomenupage() {
        btnbackregister.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
    private fun btntologinpage(){
            R_button2.setOnClickListener {
                startActivity(Intent(this,LoginActivity::class.java))
            }
        }
    private fun btntologinpagetxt(){
        txt_login.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

}