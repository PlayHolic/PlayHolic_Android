package me.plic.playholic.ui.search

import android.databinding.BaseObservable
import android.databinding.ObservableField
import me.plic.playholic.data.PopKeyword

class PopKeywordItemViewModel(item: PopKeyword) : BaseObservable() {

    val id: ObservableField<Int> = ObservableField()
    val keyword: ObservableField<String> = ObservableField()

    init {
        id.set(item.id)
        keyword.set(item.keyword)
    }
}
