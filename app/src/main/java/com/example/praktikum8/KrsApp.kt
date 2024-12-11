package com.example.praktikum8

import android.app.Application
import com.example.praktikum8.dependenciesinjection.ContainerApp

class KrsApp : Application() {
    lateinit var containerApp: ContainerApp //Fungsinya untuk menyimpan

    override fun onCreate() {
        super.onCreate()
        containerApp = ContainerApp(this) //Membuat instance
        //instance adalah object yang dibuat dari class
    }
}