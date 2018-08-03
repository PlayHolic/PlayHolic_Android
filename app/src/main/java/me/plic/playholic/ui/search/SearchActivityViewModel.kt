package me.plic.playholic.ui.search

import android.databinding.BaseObservable
import android.databinding.ObservableField

class SearchActivityViewModel : BaseObservable() {

    val isSearching: ObservableField<Boolean> = ObservableField(false)

    fun onSearchTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) =
            if (!s.isNullOrEmpty()) isSearching.set(true) else isSearching.set(false)

}

