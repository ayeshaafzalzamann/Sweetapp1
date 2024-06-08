package com.example.sweetapp

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupWindow
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home2 : AppCompatActivity() {
    private lateinit var cookiesButton: ImageButton
    private lateinit var cakeButton: ImageButton
    private lateinit var donutsButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home2)

        cookiesButton = findViewById(R.id.imageButton1)

        donutsButton = findViewById(R.id.imageButton3)
        cakeButton= findViewById(R.id.imageButton4)

        cookiesButton.setOnClickListener{
            val intent =Intent(this@Home2,cookies::class.java)
            startActivity(intent)
        }

        donutsButton.setOnClickListener{
            val intent =Intent(this@Home2,donuts::class.java)
            startActivity(intent)
        }
        cakeButton.setOnClickListener{
            val intent =Intent(this@Home2,cake::class.java)
            startActivity(intent)
        }
        val instructionButton = findViewById<ImageButton>(R.id.instruction)


        instructionButton.setOnClickListener {
            // Inflate the instruction popup layout
            val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = inflater.inflate(R.layout.activity_popup, null)

            // Create a PopupWindow
            val width = ViewGroup.LayoutParams.MATCH_PARENT
            val height = ViewGroup.LayoutParams.MATCH_PARENT
            val instructionPopupWindow = PopupWindow(view, width, height, true)

            // Show the PopupWindow at the center of the screen
            instructionPopupWindow.showAtLocation(view, Gravity.CENTER, 0, 0)

            // Add a button to close the popup (optional, based on your popup layout)
            val closeButton = view.findViewById<Button>(R.id.closebutton1)
            closeButton?.setOnClickListener {
                instructionPopupWindow.dismiss()
            }}


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.popup)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}