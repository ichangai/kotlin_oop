package com.testapp.oop_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val carOne = Car()
//        carOne.maxSpeed = 150
//        carOne.start()

        val driverOne = Driver("Mike", 50)
        driverOne.showDetails()
    }
}