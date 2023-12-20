package com.example.babynutri

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {

    private lateinit var btn_profile: ImageView
    private lateinit var btnkategori1: ImageView
    private lateinit var btnkategori2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()

        btn_profile = findViewById(R.id.btn_profile)
        btnkategori1 = findViewById(R.id.btnkategori1)
        btnkategori2 = findViewById(R.id.btnkategori2)

        btnhometoprofile()
        btnhometomenulist1()
        btnhometomenulist2()

    }
    private fun btnhometoprofile() {
        btn_profile.setOnClickListener{
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
    private fun btnhometomenulist1() {
        btnkategori1.setOnClickListener {
            startActivity(Intent(this, MenuActivity1::class.java))
        }
    }
    private fun btnhometomenulist2() {
        btnkategori2.setOnClickListener {
            startActivity(Intent(this, MenuActivity2::class.java))
        }
    }
}
