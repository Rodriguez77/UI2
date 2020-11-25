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


//        val intent = intent
//        val songname = intent.getStringExtra("songname")

//        val intent = intent
//        val songs = intent.getStringExtra("songname1" )
//        val songs2 = intent.getStringExtra("songname2")
//        val songs3 = intent.getStringExtra("songname3")
//        val songs4 = intent.getStringExtra("songname4")
//        val songs5 = intent.getStringExtra("songname5")
//        val songs6 = intent.getStringExtra("songname6")
//        val songs7 = intent.getStringExtra("songname7")
//        val songs8 = intent.getStringExtra("songname8")
//        val songs9 = intent.getStringExtra("songname9")
//        val songs10 = intent.getStringExtra("songname10")
//        val songs11 = intent.getStringExtra("songname11")
//        val songs12 = intent.getStringExtra("songname12")
//        val songs13 = intent.getStringExtra("songname13")
//        val songs14 = intent.getStringExtra("songname14")
//        val songs15 = intent.getStringExtra("songname15")
//
//
//        val songsQueueArray = arrayOf(songs, songs2, songs3, songs4, songs5, songs6, songs7, songs8, songs9, songs10, songs11, songs12, songs13, songs14, songs15)
//        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songsQueueArray)
//        val songsList = findViewById<ListView>(R.id.queue_songs)
//        songsList.adapter = adapter


