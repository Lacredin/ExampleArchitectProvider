package com.example.db

import com.example.core.DataBase
import com.example.installer.WorkBasket
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration
import javax.inject.Inject

class InstallerDB @Inject constructor(): DataBase {
    val config = RealmConfiguration.create(schema = setOf(WorkBasket::class))

    override fun getBD() = Realm.open(config)
}