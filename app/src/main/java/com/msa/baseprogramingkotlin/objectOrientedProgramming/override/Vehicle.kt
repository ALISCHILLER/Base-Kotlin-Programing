package com.msa.baseprogramingkotlin.objectOrientedProgramming.override

open class Vehicle {
    open fun start()
    {
        println("Vehicle has started.")
    }

    open fun accelerate(speed:Int)
    {
        println("Vehicle has started at $speed")
    }

    open fun stop()
    {
        println("Vehicle has stopped.")
    }

}