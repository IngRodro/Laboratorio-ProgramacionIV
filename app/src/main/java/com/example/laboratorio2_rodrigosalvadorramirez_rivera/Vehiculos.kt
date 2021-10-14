package com.example.laboratorio2_rodrigosalvadorramirez_rivera

class Vehiculos(var Modelo:String, var Marca:String, var Color:String, var Año:Int, nombre:String, DUI:String):Persona(nombre, DUI), Encender, Apagar {

    override fun encenderauto(){
        println("El Automovil esta encendido")
    }

    override fun apagarauto(){
        println("El Automovil esta apagado")
    }

    fun Datos(){
        println("El Dueño del Vehiculo es: $nombre con Numero de DUI: $DUI")
        println("Modelo: $Modelo")
        println("Marca: $Marca")
        println("Año: $Año")
        println("Color: $Color")
    }

    public override fun Propietario(){
        println("El Propietario del vehiculo es $nombre")
    }
}