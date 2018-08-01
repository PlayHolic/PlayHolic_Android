package me.plic.playholic.ui.search.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import io.reactivex.subjects.PublishSubject
import me.plic.playholic.R
import me.plic.playholic.common.adapter.BaseRecyclerViewAdapter
import me.plic.playholic.data.PopKeyword
import me.plic.playholic.ui.search.viewHolder.PopKeywordViewHolder

class PopKeywordAdapter : BaseRecyclerViewAdapter<PopKeyword, PopKeywordViewHolder>() {

    val clickSubject : PublishSubject<PopKeyword> = PublishSubject.create()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopKeywordViewHolder {
        return PopKeywordViewHolder(
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_keyword_pop, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PopKeywordViewHolder, position: Int) {
        holder.apply {
            getItem(position).also {
                bindKeywordItemViewModel(it)
                getClickObservable(it).subscribe(clickSubject)
            }
        }
    }
}