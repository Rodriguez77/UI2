package com.example.ui2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

class SongsQueueActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_songs_queue)

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, albumSongs)
       val songsList = findViewById<ListView>(R.id.songsQueued)
        songsList.adapter = adapter

    }
}



