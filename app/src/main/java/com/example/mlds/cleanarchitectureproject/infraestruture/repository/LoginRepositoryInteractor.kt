package com.example.mlds.cleanarchitectureproject.infraestruture.repository

import com.example.mlds.cleanarchitectureproject.domain.model.UserCredentials

interface LoginRepositoryInteractor {
    fun requestLogin(credential: UserCredentials)
}