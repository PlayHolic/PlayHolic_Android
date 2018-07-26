package me.plic.playholic.ui.main

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.support.v4.app.Fragment
import android.view.View
import me.plic.playholic.R
import me.plic.playholic.common.helper.Event
import me.plic.playholic.ui.comment.CommentFragment
import me.plic.playholic.ui.history.HistoryFragment
import me.plic.playholic.ui.star.StarFragment
import me.plic.playholic.ui.wish.WishFragment

class MainFragmentViewModel : ViewModel() {

    private val _replaceFragment = MutableLiveData<Event<Fragment>>()

    val replaceFragment: LiveData<Event<Fragment>>
        get() = _replaceFragment


     fun onHistoryButtonClick() {
          _replaceFragment.value = Event(HistoryFragment())
    }

    fun onFABClick(view: View) {
            when (view.id) {
                R.id.fab_wish -> _replaceFragment.value = Event(WishFragment())
                R.id.fab_star -> _replaceFragment.value = Event(StarFragment())
                R.id.fab_comment -> _replaceFragment.value = Event(CommentFragment())
            }
    }
}