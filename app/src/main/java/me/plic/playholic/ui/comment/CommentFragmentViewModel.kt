package me.plic.playholic.ui.comment

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.view.View
import me.plic.playholic.common.helper.Event

class CommentFragmentViewModel : ViewModel() {

    private val _startActivity = MutableLiveData<Event<Int>>()

    val startActivity: LiveData<Event<Int>>
        get() = _startActivity


    fun onYetButtonClick(view : View) {
        _startActivity.value = Event(view.id)
    }
}