package me.plic.playholic.data

import java.io.Serializable
import java.util.*

data class Wish(
        val title : String,
        val date : Date,
        val location : String

) : Serializable