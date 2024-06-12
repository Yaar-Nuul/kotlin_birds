package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdBirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third_bird)

        val btnPrev = findViewById<ImageView>(R.id.btnPrev2)
        val btnNext = findViewById<ImageView>(R.id.btnNext3)
        btnPrev.setOnClickListener {
            finish()
        }
        btnNext.setOnClickListener {
            val intent = Intent(this, activity_Fourth_bird::class.java)
            startActivity(intent)
        }

    }
}