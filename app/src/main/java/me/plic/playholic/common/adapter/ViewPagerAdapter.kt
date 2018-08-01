package me.plic.playholic.common.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import me.plic.playholic.ui.search.PopKeywordFragment
import me.plic.playholic.ui.search.RecentKeywordFragment


class ViewPagerAdapter(fm: FragmentManager,
                       val pageCount: Int,
                       val tabTitles: Array<String>) : FragmentStatePagerAdapter(fm) {


    override fun getItem(position: Int): Fragment = when (position) {
        0 -> RecentKeywordFragment()
        1 -> PopKeywordFragment()
        else -> RecentKeywordFragment()
    }

    override fun getCount(): Int = pageCount


    override fun getPageTitle(position: Int): CharSequence? = tabTitles[position]
    
}