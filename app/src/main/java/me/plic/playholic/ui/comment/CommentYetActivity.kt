package me.plic.playholic.ui.comment

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import me.plic.playholic.R
import me.plic.playholic.databinding.ActivityCommentYetBinding

class CommentYetActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCommentYetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_comment_yet)

        initToolbar()
    }

    private fun initToolbar() {
        setSupportActionBar(binding.toolbar?.toolbar).apply {
            supportActionBar?.apply {
                title = getString(R.string.yet_comment)
                setDisplayHomeAsUpEnabled(true)
            }
        }
    }
}
