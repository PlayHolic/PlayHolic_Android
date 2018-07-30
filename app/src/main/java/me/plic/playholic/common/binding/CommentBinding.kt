package me.plic.playholic.common.binding

import android.databinding.BindingAdapter
import android.widget.TextView
import me.plic.playholic.R

@BindingAdapter("timeFormat")
fun setTimeFormat(view : TextView, time : String) {
    view.text = (view.context.getString(R.string.comment_date) + time)
}