package me.plic.playholic.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.*
import me.plic.playholic.R
import me.plic.playholic.bucket.BucketViewModel
import me.plic.playholic.common.ActivityHelper
import me.plic.playholic.databinding.FragmentMainBinding
import me.plic.playholic.mypage.MyPageFragment
import me.plic.playholic.ticket.TicketViewModel


    lateinit var binding: FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.menu_main, menu)

        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.menu_my -> {
                replaceFragmentToActivity(MyPageFragment())
                return true
            }
        }
        return false
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)

        binding.viewModel = ViewModelProviders.of(this)
                .get(MainFragmentViewModel::class.java)
                .apply {
                    activityHelper = this@MainFragment
                }

        binding.ticketViewModel = TicketViewModel()
        binding.bucketViewModel = BucketViewModel()

        initToolbar()

        return binding.root
    }

    private fun initToolbar() {
        (activity as MainActivity).setSupportActionBar(binding.toolbar)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initBucketRecyclerView()
        initTicketRecyclerView()
    }

    private fun initBucketRecyclerView() {
        binding.recyclerBucket.apply {
            setHasFixedSize(true)
            adapter = binding.bucketViewModel?.adapter

            layoutManager = LinearLayoutManager(this@MainFragment.activity).apply {
                orientation = LinearLayoutManager.HORIZONTAL
            }
        }
    }

    private fun initTicketRecyclerView() {
        binding.recyclerTicket.apply {
            setHasFixedSize(true)
            adapter = binding.ticketViewModel?.adapter
            layoutManager = LinearLayoutManager(this@MainFragment.activity)
        }
    }

    /**
     * 새로운 프래그먼트로 교체하며 현재 프래그먼트를 백스택에 추가
     */
                activity?.supportFragmentManager,
                fragment,
                R.id.frame_main
        )
    }

}