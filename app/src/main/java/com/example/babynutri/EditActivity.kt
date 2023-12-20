package com.example.babynutri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class EditActivity : AppCompatActivity() {

    private lateinit var backeditprofile : ImageView
    private lateinit var E_button1 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)
        supportActionBar?.hide()

        backeditprofile = findViewById(R.id.backeditprofile)
        E_button1 = findViewById(R.id.E_button1)

        btnbackedittoprofilepage()
        btnupdateprofile()

    }
    private fun btnbackedittoprofilepage() {
        backeditprofile.setOnClickListener{
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
    private fun btnupdateprofile() {
        E_button1.setOnClickListener{
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}