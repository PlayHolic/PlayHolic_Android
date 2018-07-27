package me.plic.playholic.ui.star

import android.databinding.BaseObservable
import android.databinding.ObservableField
import me.plic.playholic.data.Star

class StarItemViewModel(star : Star) : BaseObservable() {

    val title : ObservableField<String> = ObservableField()
    val score : ObservableField<Double> = ObservableField()

    init {
        title.set(star.title)
        score.set(star.score)
    }
}