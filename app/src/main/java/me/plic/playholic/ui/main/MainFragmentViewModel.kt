package me.plic.playholic.ui.main

import android.arch.lifecycle.ViewModel
import me.plic.playholic.common.SwitchScreen

class MainFragmentViewModel : ViewModel() {

    lateinit var switchScreen: SwitchScreen

    fun applyFragment() {
        if (::switchScreen.isInitialized) switchScreen.applyFragment()
        else throw UninitializedPropertyAccessException("switchScreen is not initialized")
    }
}