package me.plic.playholic.ui.star

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import me.plic.playholic.R
import me.plic.playholic.databinding.ActivityStarYetBinding

class StarYetActivity : AppCompatActivity() {

    private lateinit var binding : ActivityStarYetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_star_yet)

        initToolbar()
    }

    private fun initToolbar() {
        setSupportActionBar(binding.toolbar?.toolbar).apply {
            supportActionBar?.apply {
                title = getString(R.string.yet_star)
                setDisplayHomeAsUpEnabled(true)
            }
        }
    }
}
