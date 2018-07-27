package me.plic.playholic.data

import java.io.Serializable

data class Wish(
        val title : String,
        val term : String,
        val location : String
) : Serializable