package me.plic.playholic.ui.wish

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import me.plic.playholic.R
import me.plic.playholic.data.Wish
import me.plic.playholic.databinding.FragmentSpecificBinding

class WishDetailFragment : Fragment() {

    private lateinit var binding : FragmentSpecificBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_specific, container, false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    companion object {

        const val ARGUMENT_TASK = "TASK"

        fun newInstance(task : Wish) = WishDetailFragment().apply {
            arguments = Bundle().apply {
                putSerializable(ARGUMENT_TASK, task)
            }
        }
    }
}