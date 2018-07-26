package me.plic.playholic.util

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager

/**
 * In Util class, Every method is being static.
 */
fun replaceFragmentToActivity(
        fragmentManager: FragmentManager?,
        fragment: Fragment,
        frameId: Int) {

    checkNotNull(fragmentManager)
            .beginTransaction().apply {
                replace(frameId, fragment)
                addToBackStack(null)
                commit()
            }
}

