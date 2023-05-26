package com.example.profile

import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey
import org.mongodb.kbson.ObjectId

open class ProfileData: RealmObject{
    @PrimaryKey
    var _id: ObjectId = ObjectId.invoke()
}