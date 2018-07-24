package me.plic.playholic.tag.cast

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.ObservableArrayList

class TagCastViewModel : BaseObservable() {

    @Bindable
    val tags : ObservableArrayList<String> = ObservableArrayList()

    val adapter = TagCastAdapter().apply {
        tags.add("정선아")
        tags.add("홍광호")
        tags.add("옥주현")
        tags.add("조승우")
        tags.add("손승원")
        tags.add("브래드 리틀")
        tags.add("박강현")
        tags.add("문태유")
        tags.add("김성철")

        updateItems(tags)
    }
}