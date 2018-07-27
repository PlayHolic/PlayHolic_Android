package me.plic.playholic.ui.star.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import me.plic.playholic.R
import me.plic.playholic.common.adapter.BaseRecyclerViewAdapter
import me.plic.playholic.data.Star
import me.plic.playholic.ui.star.viewHolder.StarViewHolder

class StarAdapter: BaseRecyclerViewAdapter<Star, StarViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StarViewHolder {
        return StarViewHolder(
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_star, parent, false)
        )
    }

    override fun onBindViewHolder(holder: StarViewHolder, position: Int) {
        holder.apply {
            getItem(position).apply {
                bindStarItemViewModel(this)
            }
        }
    }
}