package com.example.mlds.cleanarchitectureproject.presentation.view

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.mlds.cleanarchitectureproject.R
import com.example.mlds.cleanarchitectureproject.domain.model.User
import com.example.mlds.cleanarchitectureproject.presentation.mvp.login.ILogin
import com.example.mlds.cleanarchitectureproject.presentation.mvp.login.LoginPresenter
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity(), ILogin.LoginViewImpl {

    private var loginPresenter: ILogin.LoginPresenterImpl? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (loginPresenter == null) {
            loginPresenter = LoginPresenter(this)
        }

         loginPresenter!!.setView(this)

        entrar_btn.setOnClickListener {
            loginPresenter!!.onLoginClicked(login_ED.text.toString(), password_Ed.text.toString())
        }
    }

    override fun getLogin(isLogin: Boolean) {

        if(isLogin){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }else{
            loginPresenter!!.toast("Nao Logou!")

        }
    }

    override fun showProgressBar(visibilidade: Int) {


    }


}
