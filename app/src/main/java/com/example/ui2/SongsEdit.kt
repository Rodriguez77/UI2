package com.example.ui2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SongsEdit : AppCompatActivity() {
    lateinit var editBtnConfirm: Button
    lateinit var etTitle: EditText
    lateinit var etArtist: EditText
    lateinit var etAlbum: EditText
    lateinit var song: Song
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_songs_edit)

            val song_id = intent.getIntExtra("song_id", 0)

        val databaseHelper = DatabaseHelper(this)
        song = databaseHelper.readOne(song_id)

       etTitle = findViewById(R.id.et_songTitle)
       etArtist = findViewById(R.id.et_songArtist)
        etAlbum = findViewById(R.id.et_songAlbum)
        editBtnConfirm = findViewById(R.id.et_btn_confirm_add_song_main)

      etTitle.setText(song.title)
      etArtist.setText(song.artist)
        etAlbum.setText(song.album)

        editBtnConfirm.setOnClickListener {
            val title = etTitle.text.toString()
            val artitst = etArtist.text.toString()
            val album = etAlbum.text.toString()

            if(title.isNotEmpty() && artitst.isNotEmpty() && album.isNotEmpty()) {
                val updatesong = Song(id = song.id, title = title, artist = artitst, album = album)
                databaseHelper.update(updatesong)
                Toast.makeText(this,"Song edited successfully", Toast.LENGTH_SHORT).show()
            }
            else
                Toast.makeText(this,"Please fill up the credentials", Toast.LENGTH_SHORT).show()

        }
    }
    override fun onBackPressed() {
        startActivity(Intent(this, MainActivity::class.java))
    }
}

    