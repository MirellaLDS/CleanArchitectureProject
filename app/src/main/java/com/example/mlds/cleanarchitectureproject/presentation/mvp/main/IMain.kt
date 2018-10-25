package com.example.mlds.cleanarchitectureproject.presentation.mvp.main

import android.content.Context
import com.example.mlds.cleanarchitectureproject.domain.model.User

interface IMain {

    interface MainModelImpl {
        fun getLoginsRequest()
    }

    interface MainPresenterImpl {

        val context: Context
        fun showProgressBar(status: Boolean)
        fun setView(view: MainViewImpl)
        fun getListUsers()
        fun toast(msg: String)
    }

    interface MainViewImpl {

        fun listUsers(users: ArrayList<User>)

        companion object {
            val Users_KEY = "users"
        }
    }
}

