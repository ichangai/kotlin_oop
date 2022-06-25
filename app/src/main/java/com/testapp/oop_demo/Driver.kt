package com.testapp.oop_demo

import android.util.Log

class Driver(var name: String, credit: Int)
{
   private var totalCredit = 50
    private val carOne = Car()

init{
    totalCredit += credit
    carOne.maxSpeed = 150
    carOne.start()
}
    fun showDetails()
    {
        Log.i("MyTag", "The name of the Driver is $name with total credit of $totalCredit")
    }
}