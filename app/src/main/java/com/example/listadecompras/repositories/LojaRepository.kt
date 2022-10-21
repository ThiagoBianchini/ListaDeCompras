package com.example.listadecompras.repositories

import android.content.Context
import androidx.room.Room
import com.example.listadecompras.database.LojaDatabase
import com.example.listadecompras.models.Categoria

private const val DATABASE_NAME = "loja-db"

class LojaRepository private constructor(context: Context) {

    private val database: LojaDatabase = Room
        .databaseBuilder(
            context.applicationContext,
            LojaDatabase::class.java,
            DATABASE_NAME
        )
        .build()

    companion object {
        private var INSTANCE: LojaRepository? = null
        fun initialize(context: Context) {
            if (INSTANCE == null) {
                INSTANCE = LojaRepository(context)
            }
        }

        fun get(): LojaRepository {
            return INSTANCE
                ?: throw IllegalStateException("LojaRepository deve ser inicializado.")
        }

    }

    // Chamar o DAO:
    fun insertCategoria(categoria: Categoria) {
        database.categoriaDao().insert(categoria)
    }

    // ... implementar o resto


}

