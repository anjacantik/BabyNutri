package com.example.babynutri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {

    private lateinit var btn_profile: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()

        btn_profile = findViewById(R.id.btn_profile)

        btnhometoprofile()

    }
    private fun btnhometoprofile() {
        btn_profile.setOnClickListener{
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}