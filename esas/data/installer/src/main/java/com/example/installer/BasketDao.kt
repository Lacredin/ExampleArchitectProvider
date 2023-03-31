package com.example.installer

import io.realm.kotlin.Realm
import io.realm.kotlin.query.RealmResults

lateinit var realm: Realm

class BasketDao(val db: Realm = realm) {

    fun save(): RealmResults<WorkBasket> {
        db.writeBlocking {
            copyToRealm(WorkBasket())
        }

        return db.query(WorkBasket::class).find()
    }
}