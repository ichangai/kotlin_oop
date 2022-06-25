package com.testapp.oop_demo

import android.util.Log

class NewCar : Car(), SpeedController {
    override fun start(){
        Log.i("MyTag", "Ths is my new car starting..... And it's Brand ID is ${getBrandId()}")
    }

    override fun accelerate() {
        TODO("Not yet implemented")
    }

    override fun decelerate() {
        TODO("Not yet implemented")
    }
}

