package com.example.classesandobjectsassignment

class Cars(make: String, model: String, year: Int, weight: String) : Vehicle(make, model, year, weight){
    var isDriving: Boolean = true

    fun drive(){
        this.isDriving = true
    }
    fun stop(){
        this.isDriving = false
        tripsSinceMaintenance += 1
        if (tripsSinceMaintenance >= 100){
            needsMaintenance = true
        }
    }

}