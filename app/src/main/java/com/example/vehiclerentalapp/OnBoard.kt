package com.example.vehiclerentalapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnBoard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_on_board2)

        var button = findViewById<Button>(R.id.startBtn)
        button.setOnClickListener{
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
        }
        
    }
}