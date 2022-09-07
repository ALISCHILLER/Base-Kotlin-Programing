package com.msa.baseprogramingkotlin

fun main(args: Array<String>) {

    print("Please enter your age : ")

    var yourAge:Int= readLine()!!.toInt()

    if (yourAge < 13){
        print("You are a child.")
    } else if( yourAge< 19){
        print("Your are a teenager .")
    }
    else{
        print("You are an adult.")
    }

}