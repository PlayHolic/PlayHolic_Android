package me.plic.playholic.ui.search

import android.databinding.BaseObservable
import android.databinding.ObservableField
import me.plic.playholic.data.RecentKeyword
import java.util.*

class RecentKeywordItemViewModel(item: RecentKeyword) : BaseObservable() {

    val id: ObservableField<Int> = ObservableField()
    val keyword: ObservableField<String> = ObservableField()
    val date: ObservableField<Date> = ObservableField()

    init {
        id.set(item.id)
        keyword.set(item.keyword)
        date.set(item.date)
    }
}