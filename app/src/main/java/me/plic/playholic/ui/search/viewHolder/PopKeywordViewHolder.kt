package me.plic.playholic.ui.search.viewHolder

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import io.reactivex.Observable
import me.plic.playholic.data.PopKeyword
import me.plic.playholic.databinding.ItemKeywordPopBinding

class PopKeywordViewHolder(itemView :View) : RecyclerView.ViewHolder(itemView){

    val binding : ItemKeywordPopBinding? = DataBindingUtil.bind(itemView)

    
    fun getClickObservable(item : PopKeyword) : Observable<PopKeyword> {
        return Observable.create{emitter ->
            itemView.setOnClickListener {
                emitter.onNext(item)
            }
        }
    }
}