package com.example.mlds.cleanarchitectureproject.infraestruture.repository

import com.example.mlds.cleanarchitectureproject.domain.interactor.UserRepositoryInteractor
import com.example.mlds.cleanarchitectureproject.domain.model.User
import javax.inject.Inject

class UserRepository @Inject constructor():
    UserRepositoryInteractor {

    override fun list(): List<User> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun get(nome: String): User {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun insert(user: User): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}