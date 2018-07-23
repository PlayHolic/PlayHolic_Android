package me.plic.playholic.bucket.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import me.plic.playholic.R
import me.plic.playholic.common.adapter.BaseRecyclerViewAdapter
import me.plic.playholic.data.Bucket
import me.plic.playholic.bucket.viewHolder.BucketViewHolder

class BucketAdapter : BaseRecyclerViewAdapter<Bucket, BucketViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BucketViewHolder {
        return BucketViewHolder(
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_bucket, null, false))
    }

    override fun onBindViewHolder(holder: BucketViewHolder, position: Int) {

    }
}