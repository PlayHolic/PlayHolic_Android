package me.plic.playholic.hall.viewHolder

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import me.plic.playholic.data.Hall
import me.plic.playholic.databinding.ItemHistoryHallBinding
import me.plic.playholic.hall.HallItemViewModel

class HallViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val binding : ItemHistoryHallBinding? = DataBindingUtil.bind(itemView)

    fun bindHallItemViewModel(item : Hall) {
        binding?.hall = HallItemViewModel(item)
    }
}