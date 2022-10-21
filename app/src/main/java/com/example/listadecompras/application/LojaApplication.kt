package com.example.listadecompras.application

import android.app.Application
import com.example.listadecompras.repositories.LojaRepository

class LojaApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        LojaRepository.initialize(this)
    }
}