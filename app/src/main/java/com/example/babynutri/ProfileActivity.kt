package com.example.babynutri

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class ProfileActivity : AppCompatActivity() {

    private lateinit var backprofile : ImageView
    private lateinit var P_button1 : Button
    private lateinit var P_button2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        supportActionBar?.hide()

        backprofile = findViewById(R.id.backprofile)
        P_button1 = findViewById(R.id.P_button1)
        P_button2 = findViewById(R.id.P_button2)

        btnbackprofiletohomepage()
        btneditprofile()
        btnlogout()

        val (storedName, storedEmail) = getStoredUserData()
        val textName = findViewById<TextView>(R.id.P_text_1)
        val textEmail = findViewById<TextView>(R.id.P_text_2)
        textName.text = storedName
        textEmail.text = storedEmail


    }
    private fun btnbackprofiletohomepage() {
        backprofile.setOnClickListener{
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
    private fun btneditprofile() {
        P_button1.setOnClickListener{
            startActivity(Intent(this, EditActivity::class.java))
        }
    }
    private fun btnlogout() {
        P_button2.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
    private fun getStoredUserData(): Pair<String, String> {
        val sharedPreferences: SharedPreferences = getSharedPreferences("UserData", Context.MODE_PRIVATE)
        val name = sharedPreferences.getString("name", "") ?: ""
        val email = sharedPreferences.getString("email", "") ?: ""
        return Pair(name, email)
    }
}