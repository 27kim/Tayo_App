package com.jane.tayo_app

import io.realm.RealmObject
import io.realm.annotations.RealmClass


@RealmClass
open class RealmDto : RealmObject() {

    lateinit var tayoName_Kor :String
    lateinit var tayoName_Eng :String
    var tayoImageId :Int = 0

    fun getTayoName() : String{
        return tayoName_Kor
    }
    fun getTtayoImageId() : Int{
        return tayoImageId
    }
}