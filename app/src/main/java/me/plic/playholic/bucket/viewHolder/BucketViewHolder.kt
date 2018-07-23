package me.plic.playholic.bucket.viewHolder

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import me.plic.playholic.databinding.ItemBucketBinding

class BucketViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    val binding : ItemBucketBinding?= DataBindingUtil.bind(itemView)

}