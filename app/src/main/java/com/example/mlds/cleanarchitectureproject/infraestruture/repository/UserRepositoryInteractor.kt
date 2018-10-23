package com.example.mlds.cleanarchitectureproject.infraestruture.repository

import com.example.mlds.cleanarchitectureproject.domain.model.User

interface UserRepositoryInteractor {

    fun insert(user: User): Int

    fun list(): List<User>

    fun get(nome: String) : User
}