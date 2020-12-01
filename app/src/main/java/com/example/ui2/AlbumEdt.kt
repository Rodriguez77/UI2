package com.example.ui2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AlbumEdt : AppCompatActivity() {
    lateinit var albumTitle: EditText
    lateinit var albumRelease: EditText
    lateinit var btnConfirm: Button
    lateinit var album: Album

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album_edt)
        val album_id = intent.getIntExtra("album_id", 0)

        val databaseHelper = DatabaseHelper(this)

        album = databaseHelper.albumReadOne(album_id)

        albumTitle = findViewById(R.id.edit_Title)
        albumRelease = findViewById(R.id.edit_releaseDate)
        btnConfirm = findViewById(R.id.edit_btn_confirm_add_album_main)

        albumTitle.setText(album.title)
        albumRelease.setText(album.releaseDate)

        btnConfirm.setOnClickListener {
            val title = albumTitle.text.toString()
            val releaseDate = albumRelease.text.toString()

            if(title.isNotEmpty() && releaseDate.isNotEmpty()) {
                val albumUpdate = Album(id = album.id, title = title, releaseDate = releaseDate)
                databaseHelper.albumUpdate(albumUpdate)
                Toast.makeText(this,"Edited successfully", Toast.LENGTH_SHORT).show()
            }
            else
                Toast.makeText(this,"Please fill up", Toast.LENGTH_SHORT).show()
        }

    }
    override fun onBackPressed() {
        startActivity(Intent(this, AlbumActivity::class.java))
    }
}

