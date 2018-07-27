package me.plic.playholic.ui.wish

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.ObservableArrayList
import me.plic.playholic.data.Wish
import me.plic.playholic.ui.wish.adapter.WishAdapter

class WishViewModel : BaseObservable(){

    @Bindable
    val wishList : ObservableArrayList<Wish> = ObservableArrayList()

    val adapter = WishAdapter().apply {
        wishList.add(Wish("제목1", "2018.03.16 ~ 2018.07.27", "세종문화회관 대강당" ))
        wishList.add(Wish("제목2", "2018.03.16 ~ 2018.07.27", "세종문화회관 대강당" ))
        wishList.add(Wish("제목3", "2018.03.16 ~ 2018.07.27", "세종문화회관 대강당" ))
        wishList.add(Wish("제목4", "2018.03.16 ~ 2018.07.27", "세종문화회관 대강당" ))
        wishList.add(Wish("제목5", "2018.03.16 ~ 2018.07.27", "세종문화회관 대강당" ))

        addItems(wishList)
    }
}