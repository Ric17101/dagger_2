package com.ric17.software.daggerapplication.models

import javax.inject.Inject

class CarBrand @Inject constructor(private val car: Car) {
    fun brand() {
        print("My brand")
    }
}