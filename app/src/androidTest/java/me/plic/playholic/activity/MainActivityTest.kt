package me.plic.playholic.activity

import android.support.test.rule.ActivityTestRule
import me.plic.playholic.R
import me.plic.playholic.ui.main.MainActivity
import me.plic.playholic.ui.main.MainFragment
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @Rule @JvmField
    val activity = ActivityTestRule(MainActivity::class.java)

    @Test
    fun onCreate() {
        addFragment()
    }

    private fun addFragment() {
        activity.activity.supportFragmentManager
                .beginTransaction()
                .add(R.id.frame_main, MainFragment())
                .commit()
    }
}