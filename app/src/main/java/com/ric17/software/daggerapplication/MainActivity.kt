package com.ric17.software.daggerapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ric17.software.daggerapplication.models.Car
import com.ric17.software.daggerapplication.models.CarComponent
import com.ric17.software.daggerapplication.models.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

   @Inject lateinit var car: Car
    //@Inject lateinit var info: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: CarComponent = DaggerCarComponent.create()
        this.car = component.getCar()
        this.car.drive()
    }
}