package me.plic.playholic.ui.comment

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import me.plic.playholic.R
import me.plic.playholic.databinding.FragmentCommentBinding
import me.plic.playholic.ui.main.MainActivity


class CommentFragment : Fragment() {

    private lateinit var binding: FragmentCommentBinding
    private lateinit var viewModel: CommentFragmentViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        observeViewModelData()

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_comment, container, false)
        binding.apply {
            commentViewModel = CommentViewModel()
            viewModel = this@CommentFragment.viewModel
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
                .get(CommentFragmentViewModel::class.java)

                .apply {
                    startActivity.observe(this@CommentFragment, Observer {
                        it?.getContentIfNotHandled()?.let {
                            startActivity(Intent(this@CommentFragment.activity, CommentYetActivity::class.java))
                        }
                    })
                }
    }

    private fun initRecyclerView() {
        binding.recyclerCmt.apply {
            adapter = binding.commentViewModel?.adapter
        }
    }

    private fun initToolbar() {
        (activity as MainActivity).apply {
            setSupportActionBar(this@CommentFragment.binding.toolbar?.toolbar)
            supportActionBar?.apply {
                setDisplayHomeAsUpEnabled(true)
                title = getString(R.string.comment)
            }
        }
    }

}