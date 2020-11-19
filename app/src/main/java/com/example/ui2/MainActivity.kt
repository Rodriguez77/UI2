package com.example.ui2

import android.content.Intent
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

class MainActivity : AppCompatActivity() {
    lateinit var songsArray: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        songsArray = arrayOf("Like A Fire", "Spirit of God", "Leave Me Astounded", "My Soul Longs for Jesus", "Endless Praise",
            "Only Way" , "My Reason", "Fall On Me", "Rain Your Glory Down", "God Is on the Throne" , "Right Now", "I Choose You" ,	"This Is Our Time", "Joy", "My Heart Is Alive")
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songsArray)
        val songsQueueListView = findViewById<ListView>(R.id.songsQueueListView)
        songsQueueListView.adapter = adapter

        registerForContextMenu(songsQueueListView)
        songsQueueListView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->  }
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater = menuInflater
        inflater.inflate(R.menu.songs_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.add_to_queue -> {
                val selectedItemOrder = item!!.order
                val selectedItemTitle = item.title

                val info = item.menuInfo as AdapterContextMenuInfo
                val listPosition = info.position
                if(listPosition == 0) {

                    val songname = songsArray[listPosition]
                    intent.putExtra("songname1", songname)

                }
                else if(listPosition == 1){
                    val songname2 = songsArray[listPosition]
                    intent.putExtra("songname2", songname2)
                }
                else if(listPosition == 2){
                    val songname3 = songsArray[listPosition]
                    intent.putExtra("songname3", songname3)
                }
                else if(listPosition == 3){
                    val songname4 = songsArray[listPosition]
                    intent.putExtra("songname4", songname4)
                }
                else if(listPosition == 4){
                    val songname5 = songsArray[listPosition]
                    intent.putExtra("songname5", songname5)
                }
                else if(listPosition == 5){
                    val songname6 = songsArray[listPosition]
                    intent.putExtra("songname6", songname6)

                }
                else if(listPosition == 6){
                    val songname7 = songsArray[listPosition]
                    intent.putExtra("songname7", songname7)
                }
                else if(listPosition == 7){
                    val songname8 = songsArray[listPosition]
                    intent.putExtra("songname8", songname8)
                }
                else if(listPosition == 8){
                    val songname9 = songsArray[listPosition]
                    intent.putExtra("songname9", songname9)
                }
                else if(listPosition == 9){
                    val songname10 = songsArray[listPosition]
                    intent.putExtra("songname10", songname10)
                }
                else if(listPosition == 10){
                    val songname11 = songsArray[listPosition]
                    intent.putExtra("songname11", songname11)
                }
                else if(listPosition == 11){
                    val songname12 = songsArray[listPosition]
                    intent.putExtra("songname12", songname12)
                }
                else if(listPosition == 12){
                    val songname13 = songsArray[listPosition]
                    intent.putExtra("songname13", songname13)
                }
                else if(listPosition == 13){
                    val songname14 = songsArray[listPosition]
                    intent.putExtra("songname14", songname14)
                }
                else if(listPosition == 14){
                    val songname15 = songsArray[listPosition]
                    intent.putExtra("songname15", songname15)
                }

                true
            }
            else -> super.onContextItemSelected(item)
        }
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

                startActivity(Intent(this, AlbumActivity::class.java))
                true
            }
            R.id.go_to_queues -> {
                startActivity(Intent(this, SongsQueueActivity::class.java))

                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}