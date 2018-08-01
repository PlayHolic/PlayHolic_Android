package me.plic.playholic.ui.search

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import me.plic.playholic.R
import me.plic.playholic.data.PopKeyword
import me.plic.playholic.databinding.LayoutKeywordBinding
import me.plic.playholic.ui.search.adapter.PopKeywordAdapter

class PopKeywordFragment : Fragment() {

    private lateinit var binding: LayoutKeywordBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.layout_keyword, container, false)
        return binding.root
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.recyclerKeyword.apply {
            adapter = PopKeywordAdapter().apply {
                for (i in 1..10) {
                    addItem(PopKeyword(i, "검색어 $i"))
                }
            }
        }
    }
}