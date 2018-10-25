package com.example.mlds.cleanarchitectureproject.domain.module

import com.example.mlds.cleanarchitectureproject.domain.interactor.GetUserUseCaseInteractor
import com.example.mlds.cleanarchitectureproject.domain.useCases.GetUserUseCase
import com.example.mlds.cleanarchitectureproject.infraestruture.repository.UserRepository
import com.example.mlds.cleanarchitectureproject.domain.interactor.UserRepositoryInteractor
import dagger.Module
import dagger.Provides

@Module
class GetUserCaseModule {

    @Provides
    fun getUsers(): GetUserUseCaseInteractor {
        return GetUserUseCase()
    }

    @Provides
    fun list(): UserRepositoryInteractor {
        return UserRepository()
    }

}