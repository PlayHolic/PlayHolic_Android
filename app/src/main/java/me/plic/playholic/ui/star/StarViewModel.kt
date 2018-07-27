package me.plic.playholic.ui.star

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.ObservableArrayList
import me.plic.playholic.data.Star
import me.plic.playholic.ui.star.adapter.StarAdapter

class StarViewModel : BaseObservable() {

    @Bindable
    val stars : ObservableArrayList<Star> = ObservableArrayList()

    val adapter = StarAdapter().apply {

        for(i in 1..10) {
            if (i <= 5) {
                stars.add(Star("제목 $i", i.toDouble() ))
            } else {
                stars.add(Star("제목 $i", (i%5) + 0.5 ))
            }
        }

        addItems(stars)
    }
}