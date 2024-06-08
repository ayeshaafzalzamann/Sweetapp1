package com.example.sweetapp

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.enableEdgeToEdge
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.Intent
import android.content.SharedPreferences
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class loginactivity : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_loginactivity)



        val emailEditText=findViewById<EditText>(R.id.textView2)
        val passwordEditText=findViewById<EditText>(R.id.textView1)
        val loginButton= findViewById<Button>(R.id.button)
        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            if (email.isNotEmpty() && password.isNotEmpty()) {
                // Initialize views

                sharedPreferences = getSharedPreferences("Myprefs",Context.MODE_PRIVATE)

                loginButton.setOnClickListener{
                    val inputText = emailEditText.text.toString()
                    val editor = sharedPreferences.edit()
                    editor.putString("text",inputText)
                    editor.apply()
                }  // Initialize views
                Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this,Home2::class.java)
                startActivity(intent)
                finish()
            } else {

                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.popup)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}