package me.plic.playholic.fragment.viewHolder

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import io.reactivex.Observable
import me.plic.playholic.databinding.ItemTicketBinding

class TicketViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val binding: ItemTicketBinding? = DataBindingUtil.bind(itemView)

        fun getFoldingObservable(item : View) : Observable<View> {
            return Observable.create { emitter ->
                itemView.setOnClickListener {
                    emitter.onNext(item)
                }
            }
    }
}