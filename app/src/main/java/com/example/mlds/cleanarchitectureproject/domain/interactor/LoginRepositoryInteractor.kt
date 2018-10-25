package com.example.mlds.cleanarchitectureproject.domain.interactor

import com.example.mlds.cleanarchitectureproject.domain.model.UserCredentials

interface LoginRepositoryInteractor {
    fun requestLogin(credential: UserCredentials)
}