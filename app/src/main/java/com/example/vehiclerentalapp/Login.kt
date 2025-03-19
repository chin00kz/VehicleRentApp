package com.example.vehiclerentalapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        setContentView(R.layout.activity_login2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var loginbutton = findViewById<Button>(R.id.button6)
        loginbutton.setOnClickListener{
            var intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

        var registerbtn = findViewById<TextView>(R.id.textView10)
        registerbtn.setOnClickListener{
            var intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }

    }
}