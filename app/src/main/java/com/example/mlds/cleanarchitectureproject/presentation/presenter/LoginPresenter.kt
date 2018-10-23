package com.example.mlds.cleanarchitectureproject.presentation.presenter

import com.example.mlds.cleanarchitectureproject.domain.model.UserCredentials
import com.example.mlds.cleanarchitectureproject.domain.useCases.GetUserUseCaseInteractor
import com.example.mlds.cleanarchitectureproject.presentation.view.LoginViewInterface
import javax.inject.Inject

class LoginPresenter(val loginView: LoginViewInterface) {

    @Inject
    private lateinit var getUserUseCase: GetUserUseCaseInteractor

    fun onLoginClicked(login: String, pw: String) {

        if (isValidFormat(login, pw)){
//            requestLoginFromModel()
        } else {

        }

    }

    private fun requestLoginFromModel(credentials: UserCredentials) {
//        getUserUseCase.getUsers()
    }

    private fun isValidFormat(login: String, pw: String): Boolean {
        return true
    }

    private fun moveToNextScreen(){

    }
}