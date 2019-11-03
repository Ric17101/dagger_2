package com.ric17.software.daggerapplication.models

import dagger.Component

@Component
interface CarBrandComponent {
    fun getBrand(): CarBrand
}