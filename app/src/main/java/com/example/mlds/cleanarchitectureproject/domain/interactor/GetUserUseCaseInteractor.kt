package com.example.mlds.cleanarchitectureproject.domain.interactor

import com.example.mlds.cleanarchitectureproject.domain.model.User


interface GetUserUseCaseInteractor {
    fun getUsers(): ArrayList<User>
}