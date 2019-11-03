package com.ric17.software.daggerapplication.models

import com.ric17.software.daggerapplication.MainActivity
import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}