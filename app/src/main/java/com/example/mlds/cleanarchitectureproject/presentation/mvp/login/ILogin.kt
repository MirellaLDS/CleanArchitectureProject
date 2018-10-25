package com.example.mlds.cleanarchitectureproject.presentation.mvp.login

import android.content.Context
import com.example.mlds.cleanarchitectureproject.domain.model.User

interface ILogin {

    interface LoginModelImpl {
        fun getLoginsRequest()
    }

    interface LoginPresenterImpl {
        val context: Context
        fun showProgressBar(status: Boolean)
        fun setView(view: LoginViewImpl)
        fun showProgress()
        fun hideProgress()
        fun showError(error: String)
        fun toast(msg: String)
        fun onLoginClicked(login: String, pw: String)

    }

    interface LoginViewImpl {
       // fun updateListRecycler(peoples: ArrayList<User>)
        fun getLogin(isLogin: Boolean)
        fun showProgressBar(visibilidade: Int)

        companion object {
            val Users_KEY = "users"
        }
    }
}

