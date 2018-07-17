package me.plic.playholic.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import me.plic.playholic.MainActivity

class SplashActivity : AppCompatActivity() {

    private val delayMill = 1500L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        scheduleSplashScreen()
    }

    private fun scheduleSplashScreen() {
        Handler().postDelayed({

            goAppropriatePage(true)

            finish()

        }, delayMill)
    }

    private fun goAppropriatePage(isLogged : Boolean) {
        if(isLogged) startActivity(Intent(this, MainActivity::class.java))
        else startActivity(Intent(this, LoginActivity::class.java))

    }
}
