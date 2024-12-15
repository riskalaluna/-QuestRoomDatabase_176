package com.example.praktikum8.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.praktikum8.data.entity.Mahasiswa

@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)

    //getAllMahasiswa
    @Query("SELECT * FROM mahasiswa ORDER BY nama ASC")
    fun getAllMahasiswa(): Flow<List<Mahasiswa>>


}