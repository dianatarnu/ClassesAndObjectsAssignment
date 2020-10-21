package com.example.classesandobjectsassignment

open class Vehicle(var make: String, var model: String, var year: Int, var weight: String) {
    var needsMaintenance: Boolean = false
    var tripsSinceMaintenance: Int = 0

    open fun repair(){
        this.tripsSinceMaintenance = 0
        this.needsMaintenance = false
    }
}