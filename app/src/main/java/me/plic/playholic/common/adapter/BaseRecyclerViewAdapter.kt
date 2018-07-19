package me.plic.playholic.common.adapter

import android.support.v7.widget.RecyclerView

abstract class BaseRecyclerViewAdapter<T : Any, H : RecyclerView.ViewHolder> : RecyclerView.Adapter<H>() {

    private val itemList: MutableList<T> = mutableListOf()


    fun addItem(data: T) {
        itemList.add(data)

        notifyItemChanged(itemList.size - 1)
    }


    fun addItems(dataSet: List<T>) {
        itemList.addAll(dataSet)

        notifyDataSetChanged()
    }

    /**
     * clear list and add item list.
     */
    fun updateItems(dataSet: List<T>) {
        if (itemList.size > 0) {
            itemList.clear()
        }

        itemList.addAll(dataSet)

        notifyDataSetChanged()
    }
    
    fun getItem(positon: Int): T {
        return itemList[positon]
    }


}
