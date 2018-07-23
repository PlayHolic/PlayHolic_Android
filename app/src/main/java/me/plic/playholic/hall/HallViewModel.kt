package me.plic.playholic.hall

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.ObservableArrayList
import me.plic.playholic.data.Hall
import me.plic.playholic.hall.adapter.HallAdapter

class HallViewModel : BaseObservable() {

    @Bindable
    val halls : ObservableArrayList<Hall> = ObservableArrayList()

    val adapter = HallAdapter().apply {
        halls.add(Hall(1, "세종문화회관"))
        halls.add(Hall(2, "쁘티첼 씨어터"))
        halls.add(Hall(3, "홍익대 대학로 아트센터"))
        halls.add(Hall(4, "예술의 전당"))

        addItems(halls)
    }
}