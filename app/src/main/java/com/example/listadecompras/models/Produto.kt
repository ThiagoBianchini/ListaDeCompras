package com.example.listadecompras.models

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(foreignKeys = [
    ForeignKey(
        entity = Categoria::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("categoriaId"),
        onDelete = ForeignKey.CASCADE
    )]
)
data class Produto(

    @PrimaryKey
    val id: Long =0L,

    val categoriaId: Long = 0L,

    val nome: String = "",
)
