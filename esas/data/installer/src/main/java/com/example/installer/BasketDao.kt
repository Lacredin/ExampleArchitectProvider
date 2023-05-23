package com.example.installer

import com.example.core.DataBase
import io.realm.kotlin.query.RealmResults
import javax.inject.Inject

class BasketDao @Inject constructor(val db: DataBase) {

    fun save(): RealmResults<WorkBasket> {
        val realm = db.getBD()
        realm.writeBlocking {
            copyToRealm(WorkBasket())
        }

        return realm.query(WorkBasket::class).find()
    }
}