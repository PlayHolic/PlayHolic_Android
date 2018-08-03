package me.plic.playholic.ui.search

import android.databinding.BaseObservable
import android.databinding.ObservableField
import me.plic.playholic.data.AutoKeyword

class AutoKeywordItemViewModel(item: AutoKeyword, inputWord: String) : BaseObservable() {

    val keyword: ObservableField<String> = ObservableField()
    val word: ObservableField<String> = ObservableField()

    init {
        keyword.set(item.keyword)
        word.set(inputWord)
    }
}