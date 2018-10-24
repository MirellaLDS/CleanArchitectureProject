package com.example.mlds.cleanarchitectureproject.presentation.presenter

import android.widget.Toast
import com.example.mlds.cleanarchitectureproject.domain.model.UserCredentials
import com.example.mlds.cleanarchitectureproject.domain.useCases.DaggerMagicBox
import com.example.mlds.cleanarchitectureproject.domain.useCases.GetUserUseCaseInteractor
import com.example.mlds.cleanarchitectureproject.presentation.view.CleanApplication
import com.example.mlds.cleanarchitectureproject.presentation.view.LoginViewInterface
import java.util.logging.Logger
import javax.inject.Inject
import kotlin.math.log

class LoginPresenter(val loginView: LoginViewInterface) {

    @Inject
    lateinit var getUserUseCase: GetUserUseCaseInteractor

    fun onLoginClicked(login: String, pw: String) {

        if (isValidFormat(login, pw)){

//            DaggerMagicBox.create().inject(this)
            CleanApplication.getComponent().inject(this)
            val name = getUserUseCase.getUsers()[0].name

////            requestLoginFromModel()
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
        return true
    }

    private fun moveToNextScreen(){

    }
}