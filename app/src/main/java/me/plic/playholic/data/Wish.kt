package me.plic.playholic.data

import java.io.Serializable

data class Wish(
        val title : String,
        val term : String,
        val location : String,
        val running : String,
        val age : String,
        val cast : String,
        val crew : String,
        val producer : String
) : Serializable