package com.ric17.software.daggerapplication

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.ric17.software.daggerapplication.models.Car
import com.ric17.software.daggerapplication.models.CarComponent
import com.ric17.software.daggerapplication.models.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

   @Inject lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: CarComponent = DaggerCarComponent.create()
        component.inject(this@MainActivity)
        this.car.drive()
    }
}