package com.example.ui2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AlbumAdd : AppCompatActivity() {
    lateinit var albumTitle: EditText
    lateinit var albumRelease: EditText
    lateinit var btnConfirm: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album_add)
        val databaseHelper = DatabaseHelper(this)

        albumTitle = findViewById(R.id.albumTitle)
        albumRelease = findViewById(R.id.releaseDate)
        btnConfirm = findViewById(R.id.btn_confirm_add)
        btnConfirm.setOnClickListener {
            val Albumtitle = albumTitle.text.toString()
            val releaseDate = albumRelease.text.toString()

            if(Albumtitle.isNotEmpty() && releaseDate.isNotEmpty()) {
                val album = Album(title = Albumtitle, releaseDate = releaseDate)
                databaseHelper.albumCreate(album)
                Toast.makeText(this,"Album added successfully", Toast.LENGTH_SHORT).show()
            }
            else
                Toast.makeText(this,"Please fill up the credentials", Toast.LENGTH_SHORT).show()
            clearFields()
        }
    }
    override fun onBackPressed() {
        startActivity(Intent(this, AlbumActivity::class.java))
    }

    fun clearFields(){
        albumTitle.text.clear()
        albumRelease.text.clear()
    }
}

