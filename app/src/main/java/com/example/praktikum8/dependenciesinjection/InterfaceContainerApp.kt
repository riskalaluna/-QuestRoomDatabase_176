package com.example.praktikum8.dependenciesinjection

import android.content.Context
import com.example.praktikum8.data.database.KrsDatabase
import com.example.praktikum8.repository.LocalRepositoryMhs
import com.example.praktikum8.repository.RepositoryMhs

interface InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}
//semua repository harus dimasukkan kedalam interface ini

class ContainerApp(private val context: Context) : InterfaceContainerApp {
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}