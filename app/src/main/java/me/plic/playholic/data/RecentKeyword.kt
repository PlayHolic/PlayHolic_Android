package me.plic.playholic.data

import io.realm.RealmModel
import io.realm.annotations.RealmClass
import java.util.*

@RealmClass
open class RecentKeyword : RealmModel {

    var keyword : String =""
    var date : Date = Date()
}