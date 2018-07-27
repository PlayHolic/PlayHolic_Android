package me.plic.playholic.ui.star.viewHolder

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import me.plic.playholic.data.Star
import me.plic.playholic.databinding.ItemStarBinding
import me.plic.playholic.ui.star.StarItemViewModel

class StarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val binding: ItemStarBinding? = DataBindingUtil.bind(itemView)

    fun bindStarItemViewModel(item : Star) {
        binding?.star = StarItemViewModel(item)
    }

}