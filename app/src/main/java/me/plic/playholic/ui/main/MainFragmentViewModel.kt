package me.plic.playholic.ui.main

import android.arch.lifecycle.ViewModel
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.view.View
import me.plic.playholic.R
import me.plic.playholic.common.SwitchScreen
import me.plic.playholic.ui.wish.WishFragment

class MainFragmentViewModel : ViewModel() {

    lateinit var switchScreen: SwitchScreen
    var fgManager: FragmentManager? = null

    fun applyFragment() {
        if (::switchScreen.isInitialized) switchScreen.applyFragment()
        else throw UninitializedPropertyAccessException("switchScreen is not initialized")
    }

    fun onFABClick(view: View) {
        when (view.id) {
            R.id.fab_wish -> applyFragment(WishFragment())
        }

    }

    private fun applyFragment(fragment: Fragment) {
        fgManager?.apply {
            beginTransaction()
                    .replace(R.id.frame_main, WishFragment())
                    .addToBackStack(null)
                    .commit()
        }
    }
}