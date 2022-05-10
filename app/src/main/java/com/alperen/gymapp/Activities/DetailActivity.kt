package com.alperen.gymapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.alperen.gymapp.Exercise
import com.alperen.gymapp.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val exercise = intent.getParcelableExtra<Exercise>("exercise")

        if (exercise != null){
            val textView: TextView = findViewById(R.id.textView2)
            val detailTextView: TextView = findViewById(R.id.detailTextview)
            val imageView: ImageView = findViewById(R.id.imageView2)


            textView.text = exercise.name
            imageView.setImageResource(exercise.image)
            detailTextView.text = exercise.detail
        }

        btnWatch.setOnClickListener {
            val intent = Intent(this,YoutubeActivity::class.java).also {
                it.putExtra("youtube",textView2.text)
                startActivity(it)
            }
        }
    }
}