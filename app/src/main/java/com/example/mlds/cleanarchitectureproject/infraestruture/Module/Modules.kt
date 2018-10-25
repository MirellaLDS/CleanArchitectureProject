package com.example.mlds.cleanarchitectureproject.infraestruture.module

import com.example.mlds.cleanarchitectureproject.domain.interactor.LoginRepositoryInteractor
import com.example.mlds.cleanarchitectureproject.infraestruture.repository.LoginRepository
import com.example.mlds.cleanarchitectureproject.domain.interactor.UserRepositoryInteractor
import com.example.mlds.cleanarchitectureproject.infraestruture.repository.UserRepository
import dagger.Module
import dagger.Provides

@Module
class Modules {

    @Provides
    fun providerUser(): UserRepositoryInteractor {
        return UserRepository()
    }

    @Provides
    fun providerLogin(): LoginRepositoryInteractor {
        return LoginRepository()
    }

}