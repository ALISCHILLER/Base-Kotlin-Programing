package com.msa.baseprogramingkotlin

fun main(args: Array<String>) {
    var a:String="Hello Kotlin"
    var s:String="Language"
    var age:Int=25

    println(a)
    println(a+s)
    println(a+" "+s)
    println("ypur age is "+ age)

    var x:String="Kotlin"
    var i:Int= x.length


    println("Length of kotlin = "+ i)

    var b:Boolean= x.equals("java")
    println(b)


    var p:String="Kotlin"

    println(p.plus("language"))


    println(p.lowercase())
    println("******************")
    println(p.uppercase())

    var t:String="  Android   "

    println(x + t)


}