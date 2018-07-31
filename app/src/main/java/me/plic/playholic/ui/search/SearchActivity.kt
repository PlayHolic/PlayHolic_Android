package me.plic.playholic.ui.search

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import me.plic.playholic.R
import me.plic.playholic.common.adapter.ViewPagerAdapter
import me.plic.playholic.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_search)

        initToolbar()
        initViewPager()
    }

    private fun initToolbar() {
        setSupportActionBar(binding.toolbar?.toolbar).apply {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
    }

    private fun initViewPager() {
        binding.vpSearch.apply {
            adapter = ViewPagerAdapter(supportFragmentManager, 2,
                    arrayOf(getString(R.string.recent_keyword), getString(R.string.pop_keyword)))

            binding.tabSearch.setupWithViewPager(this)
        }
    }
}