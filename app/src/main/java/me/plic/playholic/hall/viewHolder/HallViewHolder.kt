package me.plic.playholic.hall.viewHolder

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import me.plic.playholic.databinding.ItemHistoryHallBinding

class HallViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val binding : ItemHistoryHallBinding? = DataBindingUtil.bind(itemView)
}