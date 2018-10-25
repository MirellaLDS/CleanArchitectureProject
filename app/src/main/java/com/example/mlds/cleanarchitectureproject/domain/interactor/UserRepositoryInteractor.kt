package com.example.mlds.cleanarchitectureproject.domain.interactor

import com.example.mlds.cleanarchitectureproject.domain.model.User

interface UserRepositoryInteractor {

    fun insert(user: User): Int

    fun list(): List<User>

    fun get(nome: String) : User
}