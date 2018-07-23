package me.plic.playholic.common.binding

import android.databinding.BindingAdapter
import android.databinding.BindingConversion
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*


@BindingConversion
fun dateToString(date: Date): String {
    return SimpleDateFormat("yyyy.MM.dd HH:mm a", Locale.US).format(date)
}

@BindingAdapter("dDay")
fun setDDay(view: TextView, date: Date) {
    val targetDay = Calendar.getInstance().apply {
        time = date
    }
    val today = System.currentTimeMillis() / 86400000//현재 날짜
    val dDay= targetDay.timeInMillis / 86400000

    val interval  = today - dDay

    if (interval < 0 )  view.text = "D-$interval" else view.text = "D+$interval"
}

class BucketBinding {
}