package me.plic.playholic.hall.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import me.plic.playholic.R
import me.plic.playholic.common.adapter.BaseRecyclerViewAdapter
import me.plic.playholic.data.Hall
import me.plic.playholic.hall.viewHolder.HallViewHolder

class HallAdapter : BaseRecyclerViewAdapter<Hall, HallViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HallViewHolder {
        return HallViewHolder(
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_history_hall, parent, false)
        )
    }

    override fun onBindViewHolder(holder: HallViewHolder, position: Int) {

    }
}