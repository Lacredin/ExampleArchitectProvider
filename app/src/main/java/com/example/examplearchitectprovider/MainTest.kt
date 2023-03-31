package com.example.examplearchitectprovider

import com.example.db.EsasDB
import com.example.installer.BasketUseCase
import com.example.installer.realm

class MainTest {


    fun mainTest() {
        val db = EsasDB()
        realm = db.initRealm()


        val result = BasketUseCase().test()
        result
    }
}