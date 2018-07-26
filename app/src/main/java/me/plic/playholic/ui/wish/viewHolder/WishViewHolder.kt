package me.plic.playholic.ui.wish.viewHolder

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import io.reactivex.Observable
import me.plic.playholic.data.Wish
import me.plic.playholic.databinding.ItemWishBinding

class WishViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val binding: ItemWishBinding? = DataBindingUtil.bind(itemView)

    fun getClickObservable(item: Wish): Observable<Wish> {
        return Observable.create { emitter ->
            itemView.setOnClickListener {
                emitter.onNext(item)
            }
        }
    }
}