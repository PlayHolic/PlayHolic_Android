package me.plic.playholic.util

import android.util.Log
import org.junit.Test
import java.util.*

class DDayTeset {

    @Test
    fun calculateDDay() {
        val targetDay = Calendar.getInstance().apply {
            time = Date()
        }
        val today = System.currentTimeMillis() / 86400000//현재 날짜
        val dDay = targetDay.timeInMillis / 86400000

        printDDay(today - dDay)
    }

    private fun printDDay(interval : Long ) {
        Log.d("Test", "D-$interval")
    }

}