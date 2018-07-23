package me.plic.playholic.show

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.ObservableArrayList
import me.plic.playholic.data.Show
import me.plic.playholic.show.adapter.ShowAdapter

class ShowViewModel : BaseObservable() {

    @Bindable
    val shows : ObservableArrayList<Show> = ObservableArrayList()

    val adapter = ShowAdapter().apply {
        shows.add(Show(1, "제목1", 3))
        shows.add(Show(2, "제목2", 11))
        shows.add(Show(3, "제목3", 5))
        shows.add(Show(3, "제목4", 5))
        shows.add(Show(3, "제목5", 5))

        addItems(shows)
    }

}