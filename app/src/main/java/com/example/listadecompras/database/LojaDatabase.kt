package com.example.listadecompras.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.listadecompras.daos.CategoriaDao
import com.example.listadecompras.daos.ProdutoDao
import com.example.listadecompras.models.Categoria
import com.example.listadecompras.models.Produto

@Database(entities = [Categoria::class, Produto::class], version = 1, exportSchema = false)
abstract class LojaDatabase: RoomDatabase() {


    // Interfaces que alteram o banco de dados:
    abstract fun categoriaDao(): CategoriaDao
    abstract fun produtoDao(): ProdutoDao


}