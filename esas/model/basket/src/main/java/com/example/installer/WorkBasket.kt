package com.example.installer

import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey
import org.mongodb.kbson.ObjectId

open class WorkBasket : RealmObject {
    @PrimaryKey
    var _id: ObjectId = ObjectId.invoke()
    var isComplete: Boolean = false
    var summary: String = ""
    var owner_id: String = ""
}