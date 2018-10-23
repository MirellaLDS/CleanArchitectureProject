package com.example.mlds.cleanarchitectureproject.domain.useCases

import com.example.mlds.cleanarchitectureproject.domain.model.UserCredentials
import com.example.mlds.cleanarchitectureproject.infraestruture.repository.LoginRepositoryInteractor
import dagger.Module
import dagger.Provides
import javax.inject.Inject

interface LoginUseCaseInteractor {
    fun doLogin(credential: UserCredentials)
}

class DoLoginUseCase: LoginUseCaseInteractor {

    @Inject
    private lateinit var loginRepositoryInteractor: LoginRepositoryInteractor

    override fun doLogin(credential: UserCredentials) {
        loginRepositoryInteractor.requestLogin(credential)
    }

    @Module
    inner class LoginUseCaseModule {
        @Provides
        fun getLoginUseCase(): LoginUseCaseInteractor {
            return DoLoginUseCase()
        }
    }
}