package me.plic.playholic.hall

import android.databinding.BaseObservable
import android.databinding.ObservableField
import me.plic.playholic.data.Hall

class HallItemViewModel(hall : Hall) : BaseObservable() {

    val id : ObservableField<Int> = ObservableField()
    val name : ObservableField<String> = ObservableField()

    init {
        id.set(hall.id)
        name.set(hall.name)
    }
}