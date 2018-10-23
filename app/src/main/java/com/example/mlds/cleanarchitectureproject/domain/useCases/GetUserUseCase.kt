package com.example.mlds.cleanarchitectureproject.domain.useCases

import com.example.mlds.cleanarchitectureproject.domain.model.User
import com.example.mlds.cleanarchitectureproject.infraestruture.repository.UserRepositoryInteractor
import dagger.Module
import dagger.Provides
import javax.inject.Inject

interface GetUserUseCaseInteractor {
    fun getUsers(): List<User>
}

class GetUserUseCase: GetUserUseCaseInteractor {

    @Inject
    private lateinit var userRepositoryInteractor: UserRepositoryInteractor

    override fun getUsers(): List<User> {
        return userRepositoryInteractor.list()
    }

    @Module
    inner class GetUserCaseModule {
        @Provides
        fun getUsers(): GetUserUseCaseInteractor {
            return GetUserUseCase()
        }
    }
}

