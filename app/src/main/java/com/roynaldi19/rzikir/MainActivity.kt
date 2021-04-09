package com.roynaldi19.rzikir

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.roynaldi19.rzikir.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var mediaPlayer: MediaPlayer? = null

    var count = 0
    private lateinit var tvCount: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnIstigfar.setOnClickListener {
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.takbir);
            mediaPlayer?.start();
            count++
            binding.tvCount.setText(count.toString())


        }

        binding.btnTakbir.setOnClickListener {
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.takbir);
            mediaPlayer?.start();
            count++
            binding.tvCount.setText(count.toString())


        }

        binding.btnTahlil.setOnClickListener {
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.takbir);
            mediaPlayer?.start();
            count++
            binding.tvCount.setText(count.toString())


        }

        binding.btnTahmid.setOnClickListener {
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.takbir);
            mediaPlayer?.start();
            count++
            binding.tvCount.setText(count.toString())


        }

        binding.btnTasbih.setOnClickListener {
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.takbir);
            mediaPlayer?.start();
            count++
            binding.tvCount.setText(count.toString())


        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_reset -> {
                mediaPlayer?.stop()
                count = 0
                binding.tvCount.setText(count.toString())

            }
        }
    }



}


