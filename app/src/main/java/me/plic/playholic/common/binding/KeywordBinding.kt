package me.plic.playholic.common.binding

import android.databinding.BindingAdapter
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

@BindingAdapter("searchDay")
fun dateToDayMonth(view: TextView, date: Date) {
    view.text = SimpleDateFormat("MM.dd", Locale.KOREAN).format(date)
}