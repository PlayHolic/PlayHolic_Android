package me.plic.playholic.show.viewHolder

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import me.plic.playholic.databinding.ItemHistoryShowBinding

class ShowViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    val binding : ItemHistoryShowBinding? = DataBindingUtil.bind(itemView)
}