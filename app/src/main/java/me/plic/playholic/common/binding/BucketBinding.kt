package me.plic.playholic.common.binding

import android.databinding.BindingAdapter
import android.databinding.BindingConversion
import android.widget.TextView
import me.plic.playholic.R
import java.text.SimpleDateFormat
import java.util.*


@BindingAdapter("dDay")
fun setDDay(view: TextView, date: Date) {
    val targetDay = Calendar.getInstance().apply {
        time = date
    }
    val today = System.currentTimeMillis() / 86400000//현재 날짜
    val dDay = targetDay.timeInMillis / 86400000

    val interval = today - dDay

    when {
        interval < 0 -> view.text = "D-$interval"
        interval < 0 ->  view.text = "D+$interval"
        else -> view.text = view.context.getString(R.string.today)
    }
}

class BucketBinding {
}