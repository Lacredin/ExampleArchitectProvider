package com.example.core

import io.realm.kotlin.Realm

interface DataBase {

    fun getBD(): Realm
}