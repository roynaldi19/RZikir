package com.roynaldi19.rzikir

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.roynaldi19.rzikir.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var mediaPlayer: MediaPlayer? = null

    var count = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnIstigfar.setOnClickListener {
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.takbir);
            mediaPlayer?.start();
            count++

        }

    }


}


