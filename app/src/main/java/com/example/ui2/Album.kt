package com.example.ui2

class Album(var id: Int = 0, var title: String, var releaseDate: String) {
    override fun toString(): String {
        return "Title: ${title} \n"+
                "Release Date: ${releaseDate}"
    }
}
