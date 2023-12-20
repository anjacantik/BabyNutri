package com.example.babynutri

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.AuthFailureError
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class LoginActivity : AppCompatActivity() {

    private lateinit var btnbacklogin: ImageView
    private lateinit var txt_signup: TextView
    private lateinit var L_email2: EditText
    private lateinit var L_password2: EditText
    private var email = ""
    private var password = ""
    private val URL = "http://192.168.137.1/login/login.php"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        email = ""
        password = ""
        L_email2 = findViewById(R.id.L_email2)
        L_password2 = findViewById(R.id.L_password2)

        btnbacklogin = findViewById(R.id.btnbacklogin)
        txt_signup = findViewById(R.id.txt_signup)

        btnbacklogintomenupage()
        btntosignuppage()
    }

    fun login(view: View) {
        email = L_email2.text.toString().trim()
        password = L_password2.text.toString().trim()
        if (!email.isEmpty() && !password.isEmpty()) {
            val stringRequest = object : StringRequest(Method.POST, URL,
                Response.Listener<String> { response ->
                    Log.d("res", response)
                    if (response == "success") {
                        val intent = Intent(this@LoginActivity, HomeActivity::class.java)
                        startActivity(intent)
                        finish()
                    } else if (response == "failure") {
                        Toast.makeText(
                            this@LoginActivity,
                            "Invalid Login Id/Password",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                },
                Response.ErrorListener { error ->
                    Toast.makeText(
                        this@LoginActivity,
                        error.toString().trim(),
                        Toast.LENGTH_SHORT
                    ).show()
                }) {
                @Throws(AuthFailureError::class)
                override fun getParams(): Map<String, String> {
                    val data: MutableMap<String, String> = HashMap()
                    data["email"] = email
                    data["password"] = password
                    return data
                }
            }
            val requestQueue = Volley.newRequestQueue(applicationContext)
            requestQueue.add(stringRequest)
        } else {
            Toast.makeText(this, "Fields can not be empty!", Toast.LENGTH_SHORT).show()
        }
    }



    private fun btntosignuppage() {
        txt_signup.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
    private fun btnbacklogintomenupage() {
        btnbacklogin.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

}
