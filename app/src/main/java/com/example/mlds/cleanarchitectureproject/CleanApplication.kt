package com.example.mlds.cleanarchitectureproject

import android.app.Application
import com.example.mlds.cleanarchitectureproject.domain.component.DaggerMagicBox
import com.example.mlds.cleanarchitectureproject.domain.component.MagicBox

class CleanApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        component = DaggerMagicBox
                    .builder()
                    .build()

    }

    companion object {

        private lateinit var component: MagicBox

        fun getComponent() : MagicBox {
            return component
        }
    }


}