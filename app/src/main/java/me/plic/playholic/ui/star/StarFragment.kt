package me.plic.playholic.ui.star

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
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
    private lateinit var viewModel : StarFragmentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        observeViewModelData()
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_star, container, false)
        binding.apply {
            starViewModel = StarViewModel()
            viewModel = this@StarFragment.viewModel
        }

        initToolbar()


        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initRecyclerView()
    }

    /**
     * Observe LiveData in ViewModel.
     */
    private fun observeViewModelData() {
        viewModel = ViewModelProviders.of(this)
                .get(StarFragmentViewModel::class.java)

                .apply {
                    startActivity.observe(this@StarFragment, Observer {
                        it?.getContentIfNotHandled()?.let {
                            startActivity(Intent(this@StarFragment.activity, StarYetActivity::class.java))
                        }
                    })
                }
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