package me.plic.playholic.fragment

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.*
import me.plic.playholic.R
import me.plic.playholic.activity.MainActivity
import me.plic.playholic.common.SwitchScreen
import me.plic.playholic.databinding.FragmentMainBinding
import me.plic.playholic.viewModel.MainFragmentViewModel

class MainFragment : Fragment(), SwitchScreen {

    lateinit var binding: FragmentMainBinding

    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.menu_main, menu)

        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)

        binding.viewModel = ViewModelProviders.of(this)
                .get(MainFragmentViewModel::class.java)
                .apply {
                    switchScreen = this@MainFragment
                }

        initToolbar()

        return binding.root
    }

    private fun initToolbar() {
        (activity as MainActivity).setSupportActionBar(binding.toolbar)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    /**
     * 새로운 프래그먼트로 교체하며 현재 프래그먼트를 백스택에 추가
     */
    override fun applyFragment() {
        activity?.apply {
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frame_main, HistoryFragment())
                    .addToBackStack(null)
                    .commit()
        }
    }

}