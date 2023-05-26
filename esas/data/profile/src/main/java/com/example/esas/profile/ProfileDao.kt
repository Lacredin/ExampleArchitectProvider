package com.example.esas.profile

import com.example.core.DataBase
import javax.inject.Inject

class ProfileDao @Inject constructor(val db: DataBase) {

//    fun save(): RealmResults<Pro> {
//        val realm = db.getBD()
//        realm.writeBlocking {
//            copyToRealm(WorkBasket())
//        }
//
//        return realm.query(WorkBasket::class).find()
//    }
}