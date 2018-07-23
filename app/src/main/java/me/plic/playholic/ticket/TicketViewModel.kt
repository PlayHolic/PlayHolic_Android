package me.plic.playholic.ticket

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.ObservableArrayList
import com.ramotion.foldingcell.FoldingCell
import me.plic.playholic.data.Ticket
import me.plic.playholic.ticket.adapter.TicketAdapter

class TicketViewModel : BaseObservable() {

    @Bindable
    val tickets : ObservableArrayList<Ticket> = ObservableArrayList()

    val adapter = TicketAdapter().apply {
        foldingSubject.subscribe {
            (it as FoldingCell).toggle(false)
        }

        tickets.add(Ticket("제목1", "2018.07.31 7:00 p.m.", "우리집"))
        tickets.add(Ticket("제목2", "2018.07.31 7:00 p.m.", "우리집"))
        tickets.add(Ticket("제목3", "2018.07.31 7:00 p.m.", "우리집"))
        tickets.add(Ticket("제목4", "2018.07.31 7:00 p.m.", "우리집"))
        tickets.add(Ticket("제목5", "2018.07.31 7:00 p.m.", "우리집"))
        tickets.add(Ticket("제목6", "2018.07.31 7:00 p.m.", "우리집"))

        addItems(tickets)
    }
}