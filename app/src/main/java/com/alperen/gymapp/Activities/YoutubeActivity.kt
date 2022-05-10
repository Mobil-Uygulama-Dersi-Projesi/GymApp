package com.alperen.gymapp.Activities

import android.os.Bundle
import android.provider.MediaStore.Video.Thumbnails.VIDEO_ID
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.alperen.gymapp.Exercise
import com.alperen.gymapp.R
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView
import kotlinx.android.synthetic.main.activity_youtube.*

open class YoutubeActivity : YouTubeBaseActivity() {
    val YOUTUBE_API_KEY = "AIzaSyBUX_IpqhT-W0EOsJLAQp4HRKH-zZrNNC0"

    private lateinit var youTubePlayer: YouTubePlayerView
    private lateinit var btnPlay: Button

    lateinit var youTubePlayerInit: YouTubePlayer.OnInitializedListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val youtube = intent.getStringExtra("youtube")


        val playerTextview: TextView = findViewById(R.id.playerTextview)
        youTubePlayer = findViewById(R.id.youtubePlayer)
        btnPlay = findViewById(R.id.btnPlay)

        playerTextview.text = youtube


        if (playerTextview.text == "Chair Dips"){
            youTubePlayerInit = object : YouTubePlayer.OnInitializedListener{
                override fun onInitializationSuccess(
                    p0: YouTubePlayer.Provider?,
                    p1: YouTubePlayer?,
                    p2: Boolean
                ) {
                    p1?.loadVideo("BjosWe4XaVQ")
                }

                override fun onInitializationFailure(
                    p0: YouTubePlayer.Provider?,
                    p1: YouTubeInitializationResult?
                ) {
                    Toast.makeText(applicationContext,"Failed",Toast.LENGTH_SHORT).show()
                }

            }
        }

        if (playerTextview.text == "Lungs"){
            youTubePlayerInit = object : YouTubePlayer.OnInitializedListener{
                override fun onInitializationSuccess(
                    p0: YouTubePlayer.Provider?,
                    p1: YouTubePlayer?,
                    p2: Boolean
                ) {
                    p1?.loadVideo("GmZXZgLmxhM")
                }

                override fun onInitializationFailure(
                    p0: YouTubePlayer.Provider?,
                    p1: YouTubeInitializationResult?
                ) {
                    Toast.makeText(applicationContext,"Failed",Toast.LENGTH_SHORT).show()
                }

            }
        }
        if (playerTextview.text == "Plank"){
            youTubePlayerInit = object : YouTubePlayer.OnInitializedListener{
                override fun onInitializationSuccess(
                    p0: YouTubePlayer.Provider?,
                    p1: YouTubePlayer?,
                    p2: Boolean
                ) {
                    p1?.loadVideo("zN4ztr3IFCI")
                }

                override fun onInitializationFailure(
                    p0: YouTubePlayer.Provider?,
                    p1: YouTubeInitializationResult?
                ) {
                    Toast.makeText(applicationContext,"Failed",Toast.LENGTH_SHORT).show()
                }

            }
        }
        if (playerTextview.text == "Pullups"){
            youTubePlayerInit = object : YouTubePlayer.OnInitializedListener{
                override fun onInitializationSuccess(
                    p0: YouTubePlayer.Provider?,
                    p1: YouTubePlayer?,
                    p2: Boolean
                ) {
                    p1?.loadVideo("eu3pSe55-Qg")
                }

                override fun onInitializationFailure(
                    p0: YouTubePlayer.Provider?,
                    p1: YouTubeInitializationResult?
                ) {
                    Toast.makeText(applicationContext,"Failed",Toast.LENGTH_SHORT).show()
                }

            }
        }
        if (playerTextview.text == "Pushups"){
            youTubePlayerInit = object : YouTubePlayer.OnInitializedListener{
                override fun onInitializationSuccess(
                    p0: YouTubePlayer.Provider?,
                    p1: YouTubePlayer?,
                    p2: Boolean
                ) {
                    p1?.loadVideo("C118EWbA8jU")
                }

                override fun onInitializationFailure(
                    p0: YouTubePlayer.Provider?,
                    p1: YouTubeInitializationResult?
                ) {
                    Toast.makeText(applicationContext,"Failed",Toast.LENGTH_SHORT).show()
                }

            }
        }
        if (playerTextview.text == "Side Plank"){
            youTubePlayerInit = object : YouTubePlayer.OnInitializedListener{
                override fun onInitializationSuccess(
                    p0: YouTubePlayer.Provider?,
                    p1: YouTubePlayer?,
                    p2: Boolean
                ) {
                    p1?.loadVideo("H-e2HMyUOFA")
                }

                override fun onInitializationFailure(
                    p0: YouTubePlayer.Provider?,
                    p1: YouTubeInitializationResult?
                ) {
                    Toast.makeText(applicationContext,"Failed",Toast.LENGTH_SHORT).show()
                }

            }
        }
        if (playerTextview.text == "Squates"){
            youTubePlayerInit = object : YouTubePlayer.OnInitializedListener{
                override fun onInitializationSuccess(
                    p0: YouTubePlayer.Provider?,
                    p1: YouTubePlayer?,
                    p2: Boolean
                ) {
                    p1?.loadVideo("EI2kwv_jmMY")
                }

                override fun onInitializationFailure(
                    p0: YouTubePlayer.Provider?,
                    p1: YouTubeInitializationResult?
                ) {
                    Toast.makeText(applicationContext,"Failed",Toast.LENGTH_SHORT).show()
                }

            }
        }
        if (playerTextview.text == "Star Jump"){
            youTubePlayerInit = object : YouTubePlayer.OnInitializedListener{
                override fun onInitializationSuccess(
                    p0: YouTubePlayer.Provider?,
                    p1: YouTubePlayer?,
                    p2: Boolean
                ) {
                    p1?.loadVideo("mKabHAG1s2o")
                }

                override fun onInitializationFailure(
                    p0: YouTubePlayer.Provider?,
                    p1: YouTubeInitializationResult?
                ) {
                    Toast.makeText(applicationContext,"Failed",Toast.LENGTH_SHORT).show()
                }

            }
        }



        btnPlay.setOnClickListener{
            youtubePlayer.initialize(YOUTUBE_API_KEY,youTubePlayerInit)
        }
    }
}