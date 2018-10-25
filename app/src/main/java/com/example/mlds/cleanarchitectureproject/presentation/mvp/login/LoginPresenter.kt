package com.example.mlds.cleanarchitectureproject.presentation.mvp.login

import android.content.Context
import android.text.TextUtils
import android.widget.Toast
import com.example.mlds.cleanarchitectureproject.CleanApplication
import com.example.mlds.cleanarchitectureproject.domain.interactor.GetUserUseCaseInteractor
import java.util.logging.Logger
import javax.inject.Inject

class LoginPresenter(override val context: Context):ILogin.LoginPresenterImpl{

    @Inject
    lateinit var getUserUseCase: GetUserUseCaseInteractor

    private var loginView: ILogin.LoginViewImpl? = null

    override fun  onLoginClicked(login: String, pw: String) {

        if (isValidFormat(login, pw))
        {
            CleanApplication.getComponent().inject(this)

            val users = getUserUseCase.getUsers()

             //  val logger = Logger.getLogger(">>> lOGGERR ")

            //  logger.info("Nome: $name")

            loginView!!.getLogin(true)


        } else {

          loginView!!.getLogin(false)
        }

    }

    private fun isValidFormat(login: String, pw: String): Boolean {

        if(login.equals("mirella") && pw.equals("123")){
             return true
        }

        return false
    }


    override fun showProgressBar(status: Boolean) {
    }

    override fun setView(view: ILogin.LoginViewImpl) {
        this.loginView = view
    }



    override fun showProgress() {
    }

    override fun hideProgress() {
    }

    override fun showError(error: String) {
    }

    override fun toast(msg: String) {
      Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }


}