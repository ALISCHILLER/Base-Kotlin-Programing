package com.msa.baseprogramingkotlin

import java.io.PrintWriter

fun main(args: Array<String>) {

    println("Please enter the first number : ")
    var number:Int=readLine()!!.toInt()

    println("Please enter the second number : ")
    var number1:Int=readLine()!!.toInt()


    show(number,number1)

    var a= add(number,number1)
    println("Sum of the two numbers =$a")

   var b= findMinimumNuber(number,number1)

    println("The minimum number is $b")



}

fun show(num1:Int, num2:Int){

    println("yOU ENTERED $num1 AND $num2")

}


fun add(num1:Int ,num2:Int):Int{
    var sum:Int =20
    sum=num1 + num2
    return sum
}

fun findMinimumNuber(num1:Int,num2:Int):Int{
    var minimum:Int

    if (num1 > num2 ){
        minimum =num2
    }else{
        minimum =num1
    }
    return  minimum

}