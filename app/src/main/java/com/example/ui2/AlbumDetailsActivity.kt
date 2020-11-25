package com.example.ui2

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import android.util.Log
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class AlbumDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album_details)

        var albumItems: AlbumItem = intent.getSerializableExtra("data") as AlbumItem
        var viewImage = findViewById<ImageView>(R.id.icon_details)
        var viewText = findViewById<TextView>(R.id.icon_name)

        if(albumItems.icons == R.drawable.outback_worship) {
            viewImage.setImageResource(albumItems.icons!!)

            val songsArray = mutableListOf("Like A Fire", "Spirit of God", "Leave Me Astounded",
                    "My Soul Longs for Jesus", "Endless Praise")
            val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songsArray)
            val albumSongs = findViewById<ListView>(R.id.album_songs)
            albumSongs.adapter = adapter

            albumSongs.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
                val dialogAlert = AlertDialog.Builder(this)
                dialogAlert.setMessage("Do you want to remove this song from list?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
                            val removeSong = songsArray[position]
                            songsArray.remove(removeSong)
                            adapter.notifyDataSetChanged()

                        })
                        .setNegativeButton("No", DialogInterface.OnClickListener {
                            dialog, which ->
                            dialog.cancel()
                        })
                val alert = dialogAlert.create()
                alert.setTitle("Alert! Deleting Song")
                alert.show()
            }// item listener
        }


        else if(albumItems.icons == R.drawable.rain_album){
            viewImage.setImageResource(albumItems.icons!!)
            viewText.text = "Rain"

            val songsArray =mutableListOf( "Only Way" , "My Reason", "Fall On Me", "Rain Your Glory Down",
                    "God Is on the Throne" , "Right Now", "I Choose You")
            val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songsArray)
            val albumSongs = findViewById<ListView>(R.id.album_songs)
            albumSongs.adapter = adapter
            albumSongs.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
                val dialogAlert = AlertDialog.Builder(this)
                dialogAlert.setMessage("Do you want to remove this song from list?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
                            val removeSong = songsArray[position]
                            songsArray.remove(removeSong)
                            adapter.notifyDataSetChanged()

                        })
                        .setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->
                            dialog.cancel()
                        })
                val alert = dialogAlert.create()
                alert.setTitle("Alert! Deleting Song")
                alert.show()
            }
        }
        else if(albumItems.icons == R.drawable.this_is_our_time){
            viewImage.setImageResource(albumItems.icons!!)
            viewText.text = "This is Our Time"

            val songsArray = mutableListOf("This Is Our Time", "Joy", "My Heart Is Alive")
            val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songsArray)
            val albumSongs = findViewById<ListView>(R.id.album_songs)
            albumSongs.adapter = adapter
            albumSongs.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
                val dialogAlert = AlertDialog.Builder(this)
                dialogAlert.setMessage("Do you want to remove this song from list?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
                            val removeSong = songsArray[position]
                            songsArray.remove(removeSong)
                            adapter.notifyDataSetChanged()

                        })
                        .setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->
                            dialog.cancel()
                        })
                val alert = dialogAlert.create()
                alert.setTitle("Alert! Deleting Song")
                alert.show()
            }

        }
    }

}

