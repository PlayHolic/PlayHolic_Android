package me.plic.playholic.ui.wish.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import me.plic.playholic.R
import me.plic.playholic.common.adapter.BaseRecyclerViewAdapter
import me.plic.playholic.data.Wish
import me.plic.playholic.ui.wish.viewHolder.WishViewHolder

class WishAdapter : BaseRecyclerViewAdapter<Wish, WishViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WishViewHolder {
        return WishViewHolder(
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_wish, parent, false)
        )
    }

    override fun onBindViewHolder(holder: WishViewHolder, position: Int) {
        holder.apply {
            getItem(position).apply {
                bindWishItemViewModel(this)
            }
        }
    }
}