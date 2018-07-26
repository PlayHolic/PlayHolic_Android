package me.plic.playholic.ui.wish

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.ObservableArrayList
import android.support.v4.app.Fragment
import android.util.Log
import me.plic.playholic.common.helper.Event
import me.plic.playholic.data.Wish
import me.plic.playholic.ui.wish.adapter.WishAdapter
import java.util.*

class WishViewModel : BaseObservable(){

    @Bindable
    val wishList : ObservableArrayList<Wish> = ObservableArrayList()

    private val _replaceFragment = MutableLiveData<Event<Fragment>>()

    val replaceFragment: LiveData<Event<Fragment>>
        get() = _replaceFragment

    val adapter = WishAdapter().apply {
        wishList.add(Wish("제목1", Date(), "세종문화회관 대강당" ))
        wishList.add(Wish("제목2", Date(), "세종문화회관 대강당" ))
        wishList.add(Wish("제목3", Date(), "세종문화회관 대강당" ))
        wishList.add(Wish("제목4", Date(), "세종문화회관 대강당" ))
        wishList.add(Wish("제목5", Date(), "세종문화회관 대강당" ))

        addItems(wishList)

        clickSubject.subscribe {
            _replaceFragment.value = Event(WishDetailFragment.newInstance(it))
            Log.d("Wish", "click subject")
        }
    }
}