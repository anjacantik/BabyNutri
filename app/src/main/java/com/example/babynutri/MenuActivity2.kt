package com.example.babynutri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MenuActivity2 : AppCompatActivity() {

    private lateinit var backml2 : ImageView
    private lateinit var menu2_1 : ImageView
    private lateinit var menu2_2 : ImageView
    private lateinit var menu2_3 : ImageView
    private lateinit var menu2_4 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)
        supportActionBar?.hide()

        backml2 = findViewById(R.id.backml2)
        menu2_1 = findViewById(R.id.menu2_1)
        menu2_2 = findViewById(R.id.menu2_2)
        menu2_3 = findViewById(R.id.menu2_3)
        menu2_4 = findViewById(R.id.menu2_4)

        btnml2tohomepage()
        btnmenu21todeskripsi2()
        btnmenu22todeskripsi2_2()
        btnmenu23todeskripsi2_3()
        btnmenu24todeskripsi2_4()
    }
    private fun btnml2tohomepage() {
        backml2.setOnClickListener{
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
    private fun btnmenu21todeskripsi2() {
        menu2_1.setOnClickListener{
            startActivity(Intent(this, DeskripsiActivity2::class.java))
        }
    }
    private fun btnmenu22todeskripsi2_2() {
        menu2_2.setOnClickListener{
            startActivity(Intent(this, DeskripsiActivity2_2::class.java))
        }
    }
    private fun btnmenu23todeskripsi2_3() {
        menu2_3.setOnClickListener{
            startActivity(Intent(this, DeskripsiActivity2_3::class.java))
        }
    }
    private fun btnmenu24todeskripsi2_4() {
        menu2_4.setOnClickListener{
            startActivity(Intent(this, DeskripsiActivity2_4::class.java))
        }
    }
}