package com.msa.baseprogramingkotlin.objectOrientedProgramming

fun main(args: Array<String>) {


    /**
     * Creating on object from class
     */
 /*
    var myCar  =Cars()


    myCar.name = "Ferrari"
    myCar.model = 2021

    var myCar2=Cars()

    myCar2.name="Mercedes"
    myCar2.model=2010
    println("My car's name is ${myCar.name} and its model is ${myCar.model}")
    println("My car's name is ${myCar2.name} and its model is ${myCar2.model}")
  */


    //var mynewCar = MyCars("Ferrari",2022 )
   // println("My new car's name is ${mynewCar.name} and its model is ${mynewCar.model}")


    var mySecondCars= MySecondCars("Mercedes", 2022)
    mySecondCars.name="Opel"
    mySecondCars.model=2019 //set
    println("My new Second car's name is ${mySecondCars.name} " +
            "and its model is ${mySecondCars.model}")//get

    
}