package me.plic.playholic.ui.wish

import android.databinding.BaseObservable
import android.databinding.ObservableField
import me.plic.playholic.data.Wish

class WishItemViewModel(wish : Wish) : BaseObservable() {

    var title : ObservableField<String> = ObservableField()
    var term : ObservableField<String> = ObservableField()
    var location : ObservableField<String> = ObservableField()

    init {
        title.set(wish.title)
        term.set(wish.term)
        location.set(wish.location)
    }
}