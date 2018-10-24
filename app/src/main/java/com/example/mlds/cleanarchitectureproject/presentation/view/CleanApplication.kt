package com.example.mlds.cleanarchitectureproject.presentation.view

import android.app.Application
import com.example.mlds.cleanarchitectureproject.domain.useCases.DaggerMagicBox
import com.example.mlds.cleanarchitectureproject.domain.useCases.MagicBox

class CleanApplication: Application() {

    companion object {

        private lateinit var component: MagicBox

        fun getComponent() : MagicBox {
            return component
        }
    }

    override fun onCreate() {
        super.onCreate()

        component = DaggerMagicBox.builder().build()

    }


}