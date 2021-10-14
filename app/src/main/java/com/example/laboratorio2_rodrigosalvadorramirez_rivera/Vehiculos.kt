package com.example.laboratorio2_rodrigosalvadorramirez_rivera

class Vehiculos(var Modelo:String, var Marca:String, var Color:String, var Año:Int, nombre:String, DUI:String):Persona(nombre, DUI), Encender, Apagar {

    override fun encender(){
        println("El Automovil esta encendido")
    }

    override fun apagar(){
        println("El Automovil esta apagado")
    }

    fun Datos(){
        println("El Propietario del Vehiculo es: $nombre con Numero de DUI: $DUI")
        println("Modelo: $Modelo")
        println("Marca: $Marca")
        println("Año: $Año")
    }
}