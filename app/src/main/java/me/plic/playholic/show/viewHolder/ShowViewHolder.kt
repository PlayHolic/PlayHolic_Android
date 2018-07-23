package me.plic.playholic.show.viewHolder

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import me.plic.playholic.data.Show
import me.plic.playholic.databinding.ItemHistoryShowBinding
import me.plic.playholic.show.ShowItemViewModel

class ShowViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    val binding : ItemHistoryShowBinding? = DataBindingUtil.bind(itemView)

    fun bindShowItemViewModel(item : Show) {
        binding?.show = ShowItemViewModel(item)
    }
}