package com.msa.baseprogramingkotlin

fun main(args: Array<String>) {

    for (number in 1..10){
        println("in   $number")
    }

    var sum:Int =0
    for (x in 0..5){
        println(x)
        sum +=x
    }

    println("sum of numbers = $sum")


    for(x in 0..10){
        if(x % 2 ==0){
            println(x)
            sum+=x
        }
    }

    println("sum of the even numbers =$sum")


    var myNumberArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)

    for (y in myNumberArray){
        println(y)
    }



    var myNumberArrayy = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)

    for (y in 0..(myNumberArrayy.size)-1){
        println("myNumberArrayy[$y] = ${myNumberArray[y]}")

    }


    var myNumberArrayyy = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)

    for (y in myNumberArrayyy.indices){
        println("myNumberArrayyy[$y] = ${myNumberArrayyy[y]}")

    }



    // For each
    var myNumberArr = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    myNumberArr.forEach { println(it)}


}