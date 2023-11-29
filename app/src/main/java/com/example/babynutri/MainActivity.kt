package com.example.babynutri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var button1: Button
    private lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)

        btnloginpage()
        btnsignuppage()

    }

        private fun btnloginpage() {
            button1.setOnClickListener{
                startActivity(Intent(this, LoginActivity::class.java))
            }
        }

        private fun btnsignuppage() {
            button2.setOnClickListener{
                startActivity(Intent(this,RegisterActivity::class.java))
            }
        }



}