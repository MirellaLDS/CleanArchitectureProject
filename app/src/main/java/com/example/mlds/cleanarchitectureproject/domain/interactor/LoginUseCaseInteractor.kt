package com.example.mlds.cleanarchitectureproject.domain.interactor

import com.example.mlds.cleanarchitectureproject.domain.model.UserCredentials

interface LoginUseCaseInteractor {

    fun doLogin(credential: UserCredentials)
}