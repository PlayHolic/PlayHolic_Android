package me.plic.playholic.ui.search

import android.app.Activity
import android.databinding.DataBindingUtil
import android.os.Bundle
import me.plic.playholic.R
import me.plic.playholic.databinding.ActivitySearchBinding

class SearchActivity : Activity() {

    private lateinit var binding : ActivitySearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_search)
    }
}