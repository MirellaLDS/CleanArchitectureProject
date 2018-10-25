/*
package com.example.mlds.cleanarchitectureproject.presentation.presenter

import android.text.TextUtils
import com.example.mlds.cleanarchitectureproject.domain.interactor.GetUserUseCaseInteractor
import com.example.mlds.cleanarchitectureproject.domain.model.UserCredentials
import com.example.mlds.cleanarchitectureproject.CleanApplication
import com.example.mlds.cleanarchitectureproject.presentation.mvp.login.LoginViewInterface
import java.util.logging.Logger
import javax.inject.Inject


class LoginPresenter(val loginView: LoginViewInterface) {

    @Inject
    lateinit var getUserUseCase: GetUserUseCaseInteractor

    fun onLoginClicked(login: String, pw: String) {

        if (isValidFormat(login, pw))
        {
            CleanApplication.getComponent().inject(this)

            val name = getUserUseCase.getUsers()[0].name

            loginView.showProgress()

            val logger = Logger.getLogger(">>> lOGGERR ")

            logger.info("Nome: $name")

        } else {

            loginView.hideProgress()
        }

    }

    private fun requestLoginFromModel(credentials: UserCredentials) {
//        getUserUseCase.getUsers()
    }

    private fun isValidFormat(login: String, pw: String): Boolean {

        return ( TextUtils.isEmpty(login) && TextUtils.isEmpty(pw) )
    }

    private fun moveToNextScreen(){

    }
}*/
