package com.testapp.oop_demo

import android.util.Log

open class Car {
    var maxSpeed = 30
    open fun start(){
        Log.i("MyTag", "Car is starting")
    }
}