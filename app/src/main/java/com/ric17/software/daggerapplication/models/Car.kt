package com.ric17.software.daggerapplication.models

import javax.inject.Inject

class Car @Inject constructor(private val wheels: Wheels, private val engine: Engine) {

    fun drive() {
        print("driving...")
    }
}