package me.plic.playholic.ui.main

import android.arch.lifecycle.ViewModel
import android.view.View
import me.plic.playholic.R
import me.plic.playholic.common.ActivityHelper
import me.plic.playholic.ui.history.HistoryFragment
import me.plic.playholic.ui.wish.WishFragment

class MainFragmentViewModel : ViewModel() {

    lateinit var activityHelper: ActivityHelper

    //Check activityHelper is initialized.
    private fun isActivityHelperInitialized() = (::activityHelper.isInitialized)


    fun onHistoryButtonClick() {
        if (isActivityHelperInitialized()) {
            activityHelper.replaceFragmentToActivity(HistoryFragment())
        }
    }

    fun onFABClick(view: View) {
        if (isActivityHelperInitialized()) {
            when (view.id) {
                R.id.fab_wish -> activityHelper.replaceFragmentToActivity(WishFragment())
            }
        }
    }
}