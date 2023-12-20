package com.example.babynutri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MenuActivity1 : AppCompatActivity() {

    private lateinit var backml1 : ImageView
    private lateinit var menu1_1 : ImageView
    private lateinit var menu1_2 : ImageView
    private lateinit var menu1_3 : ImageView
    private lateinit var menu1_4 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu1)
        supportActionBar?.hide()

        backml1 = findViewById(R.id.backml1)
        menu1_1 = findViewById(R.id.menu1_1)
        menu1_2 = findViewById(R.id.menu1_2)
        menu1_3 = findViewById(R.id.menu1_3)
        menu1_4 = findViewById(R.id.menu1_4)

        btnml1tohomepage()
        btnmenu11todeskripsi1()
        btnmenu12todeskripsi1_2()
        btnmenu13todeskripsi1_3()
        btnmenu14todeskripsi1_4()

    }
    private fun btnml1tohomepage() {
        backml1.setOnClickListener{
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
    private fun btnmenu11todeskripsi1() {
        menu1_1.setOnClickListener{
            startActivity(Intent(this, DeskripsiActivity1::class.java))
        }
    }
    private fun btnmenu12todeskripsi1_2() {
        menu1_2.setOnClickListener{
            startActivity(Intent(this, DeskripsiActivity1_2::class.java))
        }
    }
    private fun btnmenu13todeskripsi1_3() {
        menu1_3.setOnClickListener{
            startActivity(Intent(this, DeskripsiActivity1_3::class.java))
        }
    }
    private fun btnmenu14todeskripsi1_4() {
        menu1_4.setOnClickListener{
            startActivity(Intent(this, DeskripsiActivity1_4::class.java))
        }
    }
}