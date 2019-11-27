package com.example.kotlinrecyclerviewexample.data.model

data class MainResponse(
    var type: String,

    var region: String,

    var year: String,

    var name: String,

    var work: String
){
    override fun toString(): String {
        return "BlogPost(type='$type', region='$region', year='$year' name='$name',work='$work')"
    }
}