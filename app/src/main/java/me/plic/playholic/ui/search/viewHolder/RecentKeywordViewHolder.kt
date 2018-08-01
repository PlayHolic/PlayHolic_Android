package me.plic.playholic.ui.search.viewHolder

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import io.reactivex.Observable
import me.plic.playholic.data.RecentKeyword
import me.plic.playholic.databinding.ItemKeywordRecentBinding
import me.plic.playholic.ui.search.KeywordItemViewModel

class RecentKeywordViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    val binding : ItemKeywordRecentBinding? = DataBindingUtil.bind(itemView)

    fun bindKeywordItemViewModel(item : RecentKeyword) {
        binding?.keyword = KeywordItemViewModel(item)
    }

    fun getClickObservable(item : RecentKeyword) : Observable<RecentKeyword> {
        return Observable.create{ emitter ->
            itemView.setOnClickListener {
                emitter.onNext(item)
            }
        }
    }

    fun getDeleteClickObservable(itemId : Int)  : Observable<Int> {
        return Observable.create { emitter ->
           binding?.btnRecentDelete?.setOnClickListener {
               emitter.onNext(itemId)
           }
        }
    }
}