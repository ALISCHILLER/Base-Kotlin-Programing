package com.msa.baseprogramingkotlin.objectOrientedProgramming.override

class Car:Vehicle(){



    fun superStart()
    {

        super.start()

    }

    fun superAccelerate(){

        super.accelerate(90)

    }

    fun superStop(){
        super.stop()
    }

    override fun start()
    {
        println("Car has started.")
    }

    override fun accelerate(speed:Int)
    {
        println("Car has started at $speed")
    }

    override fun stop()
    {
        println("Car has stopped.")
    }
}