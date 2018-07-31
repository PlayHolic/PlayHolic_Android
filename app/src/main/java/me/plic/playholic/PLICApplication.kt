package me.plic.playholic

import android.app.Application
import io.realm.Realm

class PLICApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}