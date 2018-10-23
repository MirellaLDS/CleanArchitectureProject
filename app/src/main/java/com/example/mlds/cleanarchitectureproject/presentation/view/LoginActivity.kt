package com.example.mlds.cleanarchitectureproject.presentation.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mlds.cleanarchitectureproject.R
import com.example.mlds.cleanarchitectureproject.domain.useCases.GetUserUseCase
import com.example.mlds.cleanarchitectureproject.presentation.presenter.LoginPresenter
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity(),
    LoginViewInterface {

    private lateinit var loginPresenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginPresenter = LoginPresenter(this)

        entrar_btn.setOnClickListener {
            loginPresenter.onLoginClicked(login_ED.text.toString(), password_Ed.text.toString())
        }
    }

    override fun showProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(error: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
