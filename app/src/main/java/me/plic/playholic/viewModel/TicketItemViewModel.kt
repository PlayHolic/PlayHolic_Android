package me.plic.playholic.viewModel


import android.databinding.BaseObservable
import android.databinding.ObservableField
import me.plic.playholic.data.Ticket

class TicketItemViewModel(ticket :Ticket?) : BaseObservable() {

    var title : ObservableField<String> = ObservableField()
    var date : ObservableField<String> = ObservableField()
    var location : ObservableField<String> = ObservableField()

    init {
        ticket?.let {
            title.set(it.title)
            date.set(it.date)
            location.set(it.location)
        }
    }

}