package com.example.ui2

import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.AdapterContextMenuInfo
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import android.content.Intent as Intent1

class MainActivity : AppCompatActivity() {
//    lateinit var songsArray: Array<String>

    private val songsArray = arrayOf("Like A Fire", "Spirit of God", "Leave Me Astounded",
            "My Soul Longs for Jesus", "Endless Praise", "Only Way" , "My Reason", "Fall On Me",
            "Rain Your Glory Down", "God Is on the Throne" , "Right Now", "I Choose You" ,
            "This Is Our Time", "Joy", "My Heart Is Alive")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songsArray)
        val songsQueueListView = findViewById<ListView>(R.id.songsQueueListView)
        songsQueueListView.adapter = adapter

        registerForContextMenu(songsQueueListView)
//        songsQueueListView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->  }
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater = menuInflater
        inflater.inflate(R.menu.songs_menu, menu)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            R.id.go_to_songs -> {
                true
            }
            R.id.go_to_albums -> {

                startActivity(Intent1(this, AlbumActivity::class.java))
                true
            }
            R.id.go_to_queues -> {

                startActivity(Intent1(this, SongsQueueActivity::class.java))
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }


    override fun onContextItemSelected(item: MenuItem): Boolean {

        return when(item.itemId) {

            R.id.add_to_queue -> {
                val info = item.menuInfo as AdapterContextMenuInfo
                albumSongs.add(songsArray[info.position])
                true
            }
            else-> super.onContextItemSelected(item)

        }
    }
}
val albumSongs = arrayListOf<String>()