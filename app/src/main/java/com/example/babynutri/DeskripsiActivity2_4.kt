package com.example.babynutri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DeskripsiActivity2_4 : AppCompatActivity() {

    private lateinit var backd2 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deskripsi24)
        supportActionBar?.hide()

        backd2 = findViewById(R.id.backd2)

        btnbackd2toml2()
    }
    private fun btnbackd2toml2() {
        backd2.setOnClickListener{
            startActivity(Intent(this, MenuActivity2::class.java))
        }
    }
}