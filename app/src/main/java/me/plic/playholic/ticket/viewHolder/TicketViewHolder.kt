package me.plic.playholic.ticket.viewHolder

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import io.reactivex.Observable
import me.plic.playholic.data.Ticket
import me.plic.playholic.databinding.ItemTicketBinding
import me.plic.playholic.ticket.TicketItemViewModel

class TicketViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val binding: ItemTicketBinding? = DataBindingUtil.bind(itemView)

    fun bindTicketViewModel(item : Ticket) {
        binding?.viewModel = TicketItemViewModel(item)
    }

    fun getFoldingObservable(item: View): Observable<View> {
        return Observable.create { emitter ->
            itemView.setOnClickListener {
                emitter.onNext(item)
            }
        }
    }
}