package com.example.laboratorio2_rodrigosalvadorramirez_rivera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var vehiculo:Vehiculos = Vehiculos("Hilux", "Toyota","Rojo", 2019, "Rodrigo", "1842956-5")
        vehiculo.Datos()
        vehiculo.encenderauto()
        vehiculo.apagarauto()
        vehiculo.Propietario()
    }
}