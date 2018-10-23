package com.example.mlds.cleanarchitectureproject.infraestruture.Module

import com.example.mlds.cleanarchitectureproject.infraestruture.repository.LoginRepositoryInteractor
import com.example.mlds.cleanarchitectureproject.infraestruture.repository.LoginRepository
import com.example.mlds.cleanarchitectureproject.infraestruture.repository.UserRepositoryInteractor
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