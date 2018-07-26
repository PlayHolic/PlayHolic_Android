package me.plic.playholic.ui.wish

import android.databinding.BaseObservable
import android.databinding.ObservableField
import me.plic.playholic.data.Wish
import java.util.*

class WishItemViewModel(wish : Wish) : BaseObservable() {

    var title : ObservableField<String> = ObservableField()
    var date : ObservableField<Date> = ObservableField()
    var location : ObservableField<String> = ObservableField()

    init {
        title.set(wish.title)
        date.set(wish.date)
        location.set(wish.location)
    }
}