package me.plic.playholic.fragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.reactivex.subjects.PublishSubject
import me.plic.playholic.R
import me.plic.playholic.common.adapter.BaseRecyclerViewAdapter
import me.plic.playholic.data.Ticket
import me.plic.playholic.fragment.viewHolder.TicketViewHolder

class TicketAdapter : BaseRecyclerViewAdapter<Ticket, TicketViewHolder>() {

    val foldingSubject : PublishSubject<View> = PublishSubject.create()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TicketViewHolder {

        return TicketViewHolder(LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_ticket, null, false))
    }

    override fun onBindViewHolder(holder: TicketViewHolder, position: Int) {
        holder.getFoldingObservable(holder.itemView).subscribe(foldingSubject)
    }


}