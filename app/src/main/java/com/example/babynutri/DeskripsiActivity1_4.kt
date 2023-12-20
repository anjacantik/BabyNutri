package com.example.babynutri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DeskripsiActivity1_4 : AppCompatActivity() {

    private lateinit var backd1 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deskripsi14)
        supportActionBar?.hide()

        backd1 = findViewById(R.id.backd1)

        btnbackd1toml1()
    }

    private fun btnbackd1toml1() {
        backd1.setOnClickListener{
            startActivity(Intent(this, MenuActivity1::class.java))
        }
    }
}