package com.example.listadecompras.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Categoria (

    @PrimaryKey(autoGenerate = true)
        val id: Long = 0L,
        val nome: String = "",
        )
