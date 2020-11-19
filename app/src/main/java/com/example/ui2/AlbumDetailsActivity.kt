package com.example.ui2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class AlbumDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album_details)

        var albumItems: AlbumItem = intent.getSerializableExtra("data") as AlbumItem
        var viewImage = findViewById<ImageView>(R.id.icon_details)
        var viewText = findViewById<TextView>(R.id.icon_name)

        if(albumItems.icons == R.drawable.outback_worship) {
            viewImage.setImageResource(albumItems.icons!!)

            val songsQueueArray = arrayOf("Like A Fire", "Spirit of God", "Leave Me Astounded", "My Soul Longs for Jesus", "Endless Praise")
            val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songsQueueArray)
            val albumSongs = findViewById<ListView>(R.id.album_songs)
            albumSongs.adapter = adapter
        }
        else if(albumItems.icons == R.drawable.rain_album){
            viewImage.setImageResource(albumItems.icons!!)
            viewText.text = "Rain"

            val songsQueueArray = arrayOf( "Only Way" , "My Reason", "Fall On Me", "Rain Your Glory Down", "God Is on the Throne" , "Right Now", "I Choose You")
            val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songsQueueArray)
            val albumSongs = findViewById<ListView>(R.id.album_songs)
            albumSongs.adapter = adapter
        }
        else if(albumItems.icons == R.drawable.this_is_our_time){
            viewImage.setImageResource(albumItems.icons!!)
            viewText.text = "This is Our Time"

            val songsQueueArray = arrayOf("This Is Our Time", "Joy", "My Heart Is Alive")
            val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songsQueueArray)
            val albumSongs = findViewById<ListView>(R.id.album_songs)
            albumSongs.adapter = adapter
        }
    }
}
