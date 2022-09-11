package com.msa.baseprogramingkotlin.objectOrientedProgramming

fun main(args: Array<String>) {

    // creating an object from Car class

    var car =Car()

    car.type="Car"
    car.model ="Ferrari"
    car.maxSpeed =120

    car.show()
    //creating an object from Motorcycle class
    var motor =Motorcycle()
    motor.type="Motorcycle"
    motor.model="Yamaha"
    motor.maxSpeed =100
    motor.show()
}