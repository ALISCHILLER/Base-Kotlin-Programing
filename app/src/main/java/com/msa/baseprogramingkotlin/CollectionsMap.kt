package com.msa.baseprogramingkotlin

fun main(args: Array<String>){

    //immutable
    println("-------immutable map of-----------")
    var age= mapOf<String,Int>("david" to 20,"ronaldo" to 25)


    println("age of david :" + age["david"])
    println("age of Ronaldo :" + age["ronaldo"])


   //mutable

    var mutableage= mutableMapOf<String,Int>("david" to 20,"ronaldo" to 25)

    mutableage.put("buffon",30)
    println("-------mutable map of-----------")
    println("age of David :" + mutableage.get("david"))
    println("age of Ronaldo :" + mutableage.get("ronaldo"))
    println("age of Buffon :" + mutableage.get("buffon"))


}