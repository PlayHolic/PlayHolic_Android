package me.plic.playholic.main

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import me.plic.playholic.R
import me.plic.playholic.ui.main.MainActivity
import org.junit.Rule
import org.junit.Test

class MainFragmentViewModelTest {

    private val switchScreen = MainFragmentTest()

    @Rule
    @JvmField
    val activity = ActivityTestRule(MainActivity::class.java)


    @Test
    fun historyButton_ShowsScreen() {
        onView(withId(R.id.btn_history)).check(matches(isDisplayed()))
    }

    @Test
    fun historyButton_PerformClick() {
        onView(withId(R.id.btn_history)).perform(click())
        applyFragment()
    }

    private fun applyFragment() {
        switchScreen.applyFragment()
    }
}