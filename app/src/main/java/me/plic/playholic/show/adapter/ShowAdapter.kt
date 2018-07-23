package me.plic.playholic.show.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import me.plic.playholic.R
import me.plic.playholic.common.adapter.BaseRecyclerViewAdapter
import me.plic.playholic.data.Show
import me.plic.playholic.show.viewHolder.ShowViewHolder

class ShowAdapter : BaseRecyclerViewAdapter<Show, ShowViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowViewHolder {
        return ShowViewHolder(
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_history_show, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ShowViewHolder, position: Int) {

    }
}