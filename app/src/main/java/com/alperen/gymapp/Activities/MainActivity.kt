package com.alperen.gymapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.alperen.gymapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"Welcome",Toast.LENGTH_SHORT).show()

        val btnAlert = findViewById<Button>(R.id.btnAlert)
        val btnMovement = findViewById<Button>(R.id.btnMovement)

        btnAlert.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
        }

        btnMovement.setOnClickListener{
            val intent2 = Intent(this, ExerciseActivity::class.java)
            startActivity(intent2)
        }
    }

}