package com.example.mlds.cleanarchitectureproject.domain.model

data class User(var name: String, var login: String, var password: String){

    override fun toString(): String {
        return name
    }
}