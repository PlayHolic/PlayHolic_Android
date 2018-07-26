package me.plic.playholic.common.binding

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView

@BindingAdapter("layoutManager")
fun bindLayoutManager(view: RecyclerView, layoutManager: RecyclerView.LayoutManager) {
    view.setHasFixedSize(true)
    view.layoutManager = layoutManager
}

