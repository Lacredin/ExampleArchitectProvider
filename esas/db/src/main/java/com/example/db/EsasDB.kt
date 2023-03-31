package com.example.db

import com.example.installer.WorkBasket
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration

class EsasDB {

    fun initRealm(): Realm {
        val config = RealmConfiguration.create(schema = setOf(WorkBasket::class))
        val realm: Realm = Realm.open(config)
        return realm
    }
}