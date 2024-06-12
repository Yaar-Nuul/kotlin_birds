package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.squareup.picasso.Picasso

class FifthBirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.fifth_bird)


        val btnPrev = findViewById<ImageView>(R.id.btnPrev4)
        btnPrev.setOnClickListener {
            finish()
        }
        btnNext.setOnClickListener {
            val intent = Intent(this, activity_Fourth_bird::class.java)
            startActivity(intent)
        }
        binding= ThirdBirdActivity.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnNext3.setOnClickListener{
            val intent = Intent(this, SecondBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.pexels.com/photos/45851/bird-blue-cristata-cyanocitta-45851.jpeg?auto=compress&cs=tinysrgb&w=600")
            .into(binding.imageView5)

    }
}