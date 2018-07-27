package me.plic.playholic.ui.wish

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import me.plic.playholic.R
import me.plic.playholic.databinding.FragmentWishBinding
import me.plic.playholic.ui.main.MainActivity

class WishFragment : Fragment() {

    lateinit var binding : FragmentWishBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_wish, container, false)
        binding.wishViewModel = WishViewModel()

        initToolbar()

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.recyclerWish.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@WishFragment.activity)
            adapter = this@WishFragment.binding.wishViewModel?.adapter
        }
    }

    private fun initToolbar() {
        (activity as MainActivity).apply {
            setSupportActionBar(this@WishFragment.binding.toolbar?.toolbar)
            supportActionBar?.apply {
                setDisplayHomeAsUpEnabled(true)
                title = getString(R.string.wish)
            }
        }
    }


}