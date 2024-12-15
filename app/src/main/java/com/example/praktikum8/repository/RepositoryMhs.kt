package com.example.praktikum8.repository

import com.example.praktikum8.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa) //interface ini operasinya harus sesuai dengan yang di dao

    //getAllMhs
    fun getAllMhs(): Flow<List<Mahasiswa>>

    //getMhs
    fun getMhs(nim: String): Flow<Mahasiswa>
}