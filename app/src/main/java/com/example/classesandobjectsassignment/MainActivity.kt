package com.example.classesandobjectsassignment

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myCar: Cars = Cars("Hyundai","i20", 2019, "1000Kg")
        myCar.drive()
        myCar.stop()
        myCar.drive()
        myCar.stop()

        val brosCar: Cars = Cars("Volkswagen","Passat", 2010, "1500Kg")
        brosCar.drive()
        brosCar.stop()
        brosCar.drive()
        brosCar.stop()
        brosCar.drive()
        brosCar.stop()
        brosCar.drive()
        brosCar.stop()

        val dadsCar: Cars = Cars("Ford", "Focus",2004, "1250kg")
        dadsCar.drive()
        dadsCar.stop()
        dadsCar.drive()
        dadsCar.stop()
        dadsCar.drive()
        dadsCar.stop()
        dadsCar.drive()
        dadsCar.stop()
        dadsCar.drive()
        dadsCar.stop()
        dadsCar.drive()
        dadsCar.stop()
        dadsCar.drive()
        dadsCar.stop()

        Log.d("myCar", "Make: ${myCar.make}, model: ${myCar.model}, year: ${myCar.year}, weight: ${myCar.weight}, " +
                "needs maintenance: ${myCar.needsMaintenance}, trips since maintenance: ${myCar.tripsSinceMaintenance}")
        Log.d("brosCar", "Make: ${brosCar.make}, model: ${brosCar.model}, year: ${brosCar.year}, weight: ${brosCar.weight}, " +
                "needs maintenance: ${brosCar.needsMaintenance}, trips since maintenance: ${brosCar.tripsSinceMaintenance}")
        Log.d("dadsCar", "Make: ${dadsCar.make}, model: ${dadsCar.model}, year: ${dadsCar.year}, weight: ${dadsCar.weight}, " +
                "needs maintenance: ${dadsCar.needsMaintenance}, trips since maintenance: ${dadsCar.tripsSinceMaintenance}")
    }
}