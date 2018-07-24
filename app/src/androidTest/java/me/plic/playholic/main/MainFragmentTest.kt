package me.plic.playholic.main

import android.support.test.rule.ActivityTestRule
import me.plic.playholic.R
import me.plic.playholic.ui.main.MainActivity
import me.plic.playholic.ui.history.HistoryFragment
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainFragmentTest {

    @Rule
    @JvmField
    val activity = ActivityTestRule(MainActivity::class.java)

    @Before
    fun onCreate() {

    }

    @Test
    fun applyFragment() {
        activity.activity?.apply {
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_main, HistoryFragment())
                    .addToBackStack(null)
                    .commit()
        }
    }
}