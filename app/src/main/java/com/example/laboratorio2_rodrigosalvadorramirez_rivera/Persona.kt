package com.example.laboratorio2_rodrigosalvadorramirez_rivera

open class Persona(var nombre:String,var DUI:String) {

    private var name = "Rodrigo"
    protected open fun Propietario(){
        println("El Propietario del vehiculo es $name")
    }
}