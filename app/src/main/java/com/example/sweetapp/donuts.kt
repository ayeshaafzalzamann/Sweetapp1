package com.example.sweetapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class donuts : AppCompatActivity() {
    private lateinit var choclatedonut:Button
    private lateinit var chocolatedont1:Button
    private lateinit var oreocrumbl:Button
    private lateinit var oreocrumbl1:Button
    private lateinit var arrow:ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_donuts)
        choclatedonut=findViewById(R.id.cholatedonbtn)
        choclatedonut.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://prettysimplesweet.com/baked-chocolate-donuts/"))
            startActivity(i)
        }
        chocolatedont1=findViewById(R.id.cholatedonbtn1)
        chocolatedont1.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/JWEzDZIzF7g?si=KAC6Mp0OBbN5cinV"))
            startActivity(i)
        }
        oreocrumbl=findViewById(R.id.oreocrumblebtn)
        oreocrumbl.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://thecookiedoughdiaries.com/oreo-donuts/"))
            startActivity(i)
        }
        oreocrumbl1=findViewById(R.id.oreocrumblebtn1)
        oreocrumbl.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/8jE2LmoNQWQ?si=YH5UdYvVjyueaZvr"))
            startActivity(i)
        }
        arrow=findViewById(R.id.arrow1)
        arrow.setOnClickListener{
            val intent= Intent(this@donuts, Home2::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.popup)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}