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

class cake : AppCompatActivity() {
    private lateinit var chocolatecakebtn:Button
    private lateinit var chocolatebtn1:Button
    private lateinit var vanillacakebtn:Button
    private lateinit var vanillacakebtn1:Button
    private lateinit var arrow: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cake)
        chocolatecakebtn=findViewById(R.id.chocolatecakebtn)
        chocolatecakebtn.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://sallysbakingaddiction.com/triple-chocolate-layer-cake/"))
            startActivity(i)
        }
        chocolatebtn1=findViewById(R.id.cholatecakebtn1)
        chocolatebtn1.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/PAZ5pRqqTv4?si=1inrJrMvUSAqrA2l"))
            startActivity(i)
        }
        vanillacakebtn=findViewById(R.id.vanillacakebtn)
        vanillacakebtn.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.recipetineats.com/my-very-best-vanilla-cake/"))
            startActivity(i)

        }
        vanillacakebtn1=findViewById(R.id.vanillacakebtn1)
        vanillacakebtn1.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Ob6CYhAsKN8"))
            startActivity(i)
        }
        arrow=findViewById(R.id.arrow1)
        arrow.setOnClickListener{
            val intent= Intent(this@cake, Home2::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.popup)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}