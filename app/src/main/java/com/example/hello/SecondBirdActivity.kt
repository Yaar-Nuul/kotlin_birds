package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityMainBinding
import com.example.hello.databinding.ActivitySecondBird2Binding

class SecondBirdActivity : AppCompatActivity()
{      lateinit var binding: ActivitySecondBird2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding= SecondBirdActivity.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnNext.setOnClickListener{
            val intent = Intent(this, SecondBirdActivity::class.java)
            startActivity(intent)


    val btnPrev = findViewById<ImageView>(R.id.btnPrev1)
        val btnNext = findViewById<ImageView>(R.id.btnNext2)
        btnPrev.setOnClickListener {
            finish()
        }
        btnNext.setOnClickListener {
            val intent = Intent(this, ThirdBirdActivity::class.java)
            startActivity(intent)
        }
    }
}