package com.example.ui2

import java.io.Serializable

class Song (var id: Int = 0, var title: String, var artist: String, var album: String){
    override fun toString(): String {
        return  "Album: ${album} \n"+
                "Song Title: ${title} \n"+
                "Artist: ${artist}"
    }
}