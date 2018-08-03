package me.plic.playholic.ui.search

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import me.plic.playholic.R
import me.plic.playholic.common.adapter.ViewPagerAdapter
import me.plic.playholic.data.AutoKeyword
import me.plic.playholic.databinding.ActivitySearchBinding
import me.plic.playholic.ui.search.adapter.AutoKeywordAdapter


class SearchActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_search)
        binding.viewModel = SearchActivityViewModel()


        initToolbar()
        initViewPager()
    }

    private fun initToolbar() {
        setSupportActionBar(binding.toolbar?.toolbar).apply {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }

        val keywords = mutableListOf(
                AutoKeyword("가나다"), AutoKeyword("나다라"),
                AutoKeyword("라마바"), AutoKeyword("마사바"),
                AutoKeyword("마나가")
        )

        binding.toolbar?.editSearch?.apply {
            setAdapter(AutoKeywordAdapter(
                    this@SearchActivity, R.layout.item_keyword_auto, keywords).apply {
            })
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