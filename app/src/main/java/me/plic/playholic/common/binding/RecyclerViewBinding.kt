package me.plic.playholic.common.binding

import android.databinding.BindingAdapter
import android.databinding.BindingConversion
import android.support.v7.widget.RecyclerView
import java.text.SimpleDateFormat
import java.util.*

@BindingAdapter("layoutManager")
fun bindLayoutManager(view: RecyclerView, layoutManager: RecyclerView.LayoutManager) {
    view.setHasFixedSize(true)
    view.layoutManager = layoutManager
}

@BindingConversion
fun dateToString(date: Date): String {
    return SimpleDateFormat("yyyy.MM.dd hh:mma", Locale.US).format(date)
}

