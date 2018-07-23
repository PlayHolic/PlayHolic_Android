package me.plic.playholic.ui.main

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import me.plic.playholic.R
import me.plic.playholic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        addFragment()
    }

    private fun addFragment() {
        supportFragmentManager
                .beginTransaction()
                .add(R.id.frame_main, MainFragment())
                .commit()
    }

}
