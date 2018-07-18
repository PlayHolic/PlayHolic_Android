package me.plic.playholic.fragment

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import me.plic.playholic.R
import me.plic.playholic.activity.MainActivity
import me.plic.playholic.databinding.FragmentMypageBinding

class MyPageFragment : Fragment() {

    lateinit var binding : FragmentMypageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_mypage, container, false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initToolbar()
    }

    private fun initToolbar() {
        (activity as MainActivity).apply {
            setSupportActionBar(this@MyPageFragment.binding.toolbar?.toolbar)

            supportActionBar?.apply {
                title = getString(R.string.menu_my)
                setDisplayHomeAsUpEnabled(true)
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == android.R.id.home) {
            activity?.onBackPressed()
            return true
        }
        return false
    }
}