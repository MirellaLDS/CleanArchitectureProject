package com.example.mlds.cleanarchitectureproject.domain.useCases

import com.example.mlds.cleanarchitectureproject.CleanApplication
import com.example.mlds.cleanarchitectureproject.domain.interactor.GetUserUseCaseInteractor
import com.example.mlds.cleanarchitectureproject.domain.model.User
import com.example.mlds.cleanarchitectureproject.domain.interactor.UserRepositoryInteractor
import javax.inject.Inject


class GetUserUseCase @Inject constructor(): GetUserUseCaseInteractor {

    @Inject
    lateinit var userRepositoryInteractor: UserRepositoryInteractor

    override fun getUsers(): ArrayList<User> {

        // return userRepositoryInteractor.list()


     //   CleanApplication.getComponent().inject(this)


       // userRepositoryInteractor.list()


        return arrayListOf(User("Mirella", "mlds", "321456"))
    }

}




