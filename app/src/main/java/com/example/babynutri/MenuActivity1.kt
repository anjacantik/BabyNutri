package com.example.babynutri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MenuActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu1)
        supportActionBar?.hide()
    }
}