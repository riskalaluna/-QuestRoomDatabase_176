package com.example.praktikum8.repository

import com.example.praktikum8.data.entity.Mahasiswa

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa) //interface ini operasinya harus sesuai dengan yang di dao
}