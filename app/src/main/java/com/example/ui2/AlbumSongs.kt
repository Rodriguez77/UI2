package com.example.ui2

class AlbumSongs(var id: Int = 0, var title: String, var artist: String) {
    override fun toString(): String {
        return "Songs Title: ${title} \n"+
                "Artist: ${artist}"
    }
}