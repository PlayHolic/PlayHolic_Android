package me.plic.playholic.data

import io.realm.Realm
import io.realm.RealmObject.deleteFromRealm
import io.realm.kotlin.createObject
import io.realm.kotlin.where
import java.util.*

fun addRecentKeyword(realm: Realm, id: Int, keyword: String) {
    realm.executeTransactionAsync {
        it.createObject<RecentKeyword>().apply {
            this.id = id
            this.keyword = keyword
            this.date = Date()
        }
    }
}


fun deleteRecentKeyword(realm: Realm, id: Int) {
    realm.executeTransactionAsync {
        it.where<RecentKeyword>().equalTo(RecentKeyword::id.name, id).findFirst()?.let {
            deleteFromRealm(it)
        }
    }
}