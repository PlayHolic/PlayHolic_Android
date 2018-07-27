package me.plic.playholic.ui.star

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import me.plic.playholic.R
import me.plic.playholic.common.view.ItemOffsetDecorator
import me.plic.playholic.databinding.FragmentStarBinding
import me.plic.playholic.ui.main.MainActivity

class StarFragment: Fragment() {

    private lateinit var binding : FragmentStarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_star, container, false)
        binding.starViewModel = StarViewModel()

        initToolbar()

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.recyclerStar.apply {
            this@StarFragment.context?.let {
                setHasFixedSize(true)
                layoutManager = GridLayoutManager(it, 3)
                addItemDecoration(ItemOffsetDecorator(
                        resources.getDimensionPixelSize(R.dimen.item_default_margin), 3))
                adapter = this@StarFragment.binding.starViewModel?.adapter

            }
        }
    }

    private fun initToolbar() {
        (activity as MainActivity).apply {
            setSupportActionBar(this@StarFragment.binding.toolbar?.toolbar)
            supportActionBar?.apply {
                setDisplayHomeAsUpEnabled(true)
                title = getString(R.string.star)
            }
        }
    }

}