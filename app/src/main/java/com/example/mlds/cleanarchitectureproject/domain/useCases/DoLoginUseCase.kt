package com.example.mlds.cleanarchitectureproject.domain.useCases

import com.example.mlds.cleanarchitectureproject.domain.interactor.LoginUseCaseInteractor
import com.example.mlds.cleanarchitectureproject.domain.model.UserCredentials
import dagger.Module
import dagger.Provides



class DoLoginUseCase: LoginUseCaseInteractor {

//    @Inject
//    private lateinit var loginRepositoryInteractor: LoginRepositoryInteractor

    override fun doLogin(credential: UserCredentials) {
//        loginRepositoryInteractor.requestLogin(credential)
    }

    @Module
    inner class LoginUseCaseModule {
        @Provides
        fun getLoginUseCase(): LoginUseCaseInteractor {
            return DoLoginUseCase()
        }
    }
}