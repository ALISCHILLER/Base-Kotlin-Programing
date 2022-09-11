package com.msa.baseprogramingkotlin.objectOrientedProgramming

class MySecondCars {


    var name:String?=null
    var model:Int?=null
        get
    constructor(name: String?, model: Int?) {
        this.name = name
        this.model = model
    }

    constructor()
}