package com.example.babynutri

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.AuthFailureError
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import java.util.HashMap
import android.widget.ImageView
import android.util.Log

class RegisterActivity : AppCompatActivity() {

    private lateinit var btnbackregister: ImageView
    private lateinit var txt_login: TextView
    private lateinit var R_nama2: EditText
    private lateinit var R_email2: EditText
    private lateinit var R_passwordEditText2: EditText
    private lateinit var R_passwordEditText4: EditText
    private lateinit var tvStatus: TextView
    private lateinit var R_button2: Button
    private var URL = "http://192.168.137.1/login/register.php"
    private var name = ""
    private var email = ""
    private var password = ""
    private var reenterPassword = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        R_nama2 = findViewById(R.id.R_nama2)
        R_email2 = findViewById(R.id.R_email2)
        R_passwordEditText2 = findViewById(R.id.R_passwordEditText2)
        R_passwordEditText4 = findViewById(R.id.R_passwordEditText4)
        tvStatus = findViewById(R.id.tvStatus)
        R_button2 = findViewById(R.id.R_button2)

        btnbackregister = findViewById(R.id.btnbackregister)
        txt_login = findViewById(R.id.txt_login)

        btnbackregistertomenupage()
        btntologinpagetxt()
    }

    fun save(view: View) {
        name = R_nama2.text.toString().trim()
        email = R_email2.text.toString().trim()
        password = R_passwordEditText2.text.toString().trim()
        reenterPassword = R_passwordEditText4.text.toString().trim()

        if (password != reenterPassword) {
            Toast.makeText(this, "Password Mismatch", Toast.LENGTH_SHORT).show()
        } else if (!name.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
            val stringRequest = object : StringRequest(Request.Method.POST, URL,
                Response.Listener<String> { response ->
                    if (response == "success") {
                        tvStatus.text = "Successfully registered."
                        R_button2.isClickable = false

                        saveUserDataToSharedPreferences(name, email)
                    } else if (response == "failure") {
                        tvStatus.text = "Something went wrong!"
                    }
                },
                Response.ErrorListener { error ->
                    Toast.makeText(applicationContext, error.toString().trim(), Toast.LENGTH_SHORT)
                        .show()
                }) {
                @Throws(AuthFailureError::class)
                override fun getParams(): Map<String, String> {
                    val data: MutableMap<String, String> = HashMap()
                    data["name"] = name
                    data["email"] = email
                    data["password"] = password
                    return data
                }
            }
            val requestQueue = Volley.newRequestQueue(applicationContext)
            requestQueue.add(stringRequest)
        }
    }

    fun login(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun btnbackregistertomenupage() {
        btnbackregister.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun btntologinpagetxt() {
        txt_login.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
    private fun saveUserDataToSharedPreferences(name: String, email: String) {
        val sharedPreferences: SharedPreferences = getSharedPreferences("UserData", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("name", name)
        editor.putString("email", email)
        editor.apply()
    }

}
