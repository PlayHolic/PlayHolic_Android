package me.plic.playholic.history

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import me.plic.playholic.R
import me.plic.playholic.databinding.FragmentHistroyBinding
import me.plic.playholic.hall.HallViewModel
import me.plic.playholic.show.ShowViewModel

class HistoryFragment : Fragment() {

    lateinit var binding : FragmentHistroyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_histroy, container, false)
        binding.showViewModel = ShowViewModel()
        binding.hallViewModel = HallViewModel()

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initShowRecyclerView()
        initHallRecyclerView()
    }

    private fun initShowRecyclerView(){

        binding.recyclerShow.apply {
            adapter = binding.showViewModel?.adapter
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@HistoryFragment.activity)
        }
    }

    private fun initHallRecyclerView() {

        binding.recyclerHall.apply {
            adapter = binding.hallViewModel?.adapter
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@HistoryFragment.activity)
        }
    }
}