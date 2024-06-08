package com.example.sweetapp

import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class cookies : AppCompatActivity() {
    private lateinit var caremelbtn:Button
    private lateinit var caramelbtn1:Button
    private lateinit var chocalatechip:Button
    private lateinit var cholatechip1:Button
    private lateinit var arrow:ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cookies)
        caremelbtn=findViewById(R.id.caramelbtn)
        caremelbtn.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.modernhoney.com/salted-caramel-cookies/#wprm-recipe-container-17382"))
            startActivity(i)
        }
        caramelbtn1=findViewById(R.id.caramelbtn1)
        caramelbtn1.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/EJujy3zLn4E?si=mkvKP1gjG0yLX4Ys"))
            startActivity(i)
        }
        chocalatechip=findViewById(R.id.choclatechip)
        chocalatechip.setOnClickListener{
            val i= Intent(Intent.ACTION_VIEW, Uri.parse("https://sallysbakingaddiction.com/chewy-chocolate-chip-cookies/"))
            startActivity(i)
        }
        cholatechip1=findViewById(R.id.choclatechip1)
        cholatechip1.setOnClickListener{
            val i= Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/ne3KWSG6994?si=cgOBqZv93hOTrlyv"))
            startActivity(i)
            }
        arrow=findViewById(R.id.arrow1)
        arrow.setOnClickListener{
            val intent= Intent(this@cookies, Home2::class.java)
            startActivity(intent)
        }

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.popup)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}