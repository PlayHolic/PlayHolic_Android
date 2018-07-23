package me.plic.playholic.show

import android.databinding.BaseObservable
import android.databinding.ObservableField
import me.plic.playholic.data.Show

class ShowItemViewModel(show : Show) : BaseObservable() {

    val id : ObservableField<Int> = ObservableField()
    val title : ObservableField<String> = ObservableField()
    val count : ObservableField<Int> = ObservableField()

    init {
        id.set(show.id)
        title.set(show.title)
        count.set(show.count)
    }
}