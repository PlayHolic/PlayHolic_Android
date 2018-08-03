package me.plic.playholic.ui.search.viewHolder

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import io.reactivex.Observable
import me.plic.playholic.data.AutoKeyword
import me.plic.playholic.databinding.ItemKeywordAutoBinding
import me.plic.playholic.ui.search.AutoKeywordItemViewModel

class AutoKeywordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val binding: ItemKeywordAutoBinding? = DataBindingUtil.bind(itemView)


    fun bindAutoKeywordItemViewModel(item: AutoKeyword, inputWord: String) {
        binding?.auto = AutoKeywordItemViewModel(item, inputWord)
    }

    fun getClickObservable(item: AutoKeyword): Observable<AutoKeyword> =
            Observable.create { emitter ->
                itemView.setOnClickListener {
                    emitter.onNext(item)
                }
            }
}