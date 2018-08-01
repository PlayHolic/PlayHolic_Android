package me.plic.playholic.ui.star

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import me.plic.playholic.R
import me.plic.playholic.databinding.ActivityYetBinding

class StarYetActivity : AppCompatActivity() {

    private lateinit var binding : ActivityYetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_yet)

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
