package com.example.composerecyclerviewpractice.data

data class Puppy(
    val id:Int,
    val title:String,
    val gender :String,
    val age :Int,
    val description :String,
    val puppyImageId:Int =0
)
