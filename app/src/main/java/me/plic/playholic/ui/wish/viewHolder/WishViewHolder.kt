package me.plic.playholic.ui.wish.viewHolder

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import io.reactivex.Observable
import me.plic.playholic.data.Wish
import me.plic.playholic.databinding.ItemWishBinding
import me.plic.playholic.ui.wish.WishItemViewModel

class WishViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val binding: ItemWishBinding? = DataBindingUtil.bind(itemView)

    fun bindWishItemViewModel(item : Wish) {
        binding?.wish= WishItemViewModel(item)
    }

    fun getClickObservable(item: Wish): Observable<Wish> {
        return Observable.create { emitter ->
            itemView.setOnClickListener {
                emitter.onNext(item)
            }
        }
    }
}