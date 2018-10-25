package com.example.mlds.cleanarchitectureproject.presentation.mvp.main

import android.content.Context
import android.text.TextUtils
import android.widget.Toast
import com.example.mlds.cleanarchitectureproject.CleanApplication
import com.example.mlds.cleanarchitectureproject.domain.interactor.GetUserUseCaseInteractor
import com.example.mlds.cleanarchitectureproject.presentation.mvp.login.ILogin
import java.util.logging.Logger
import javax.inject.Inject

class MainPresenter(override val context: Context):IMain.MainPresenterImpl{


    @Inject
    lateinit var getUserUseCase: GetUserUseCaseInteractor

    private var mainView: IMain.MainViewImpl? = null


    override fun getListUsers() {
        CleanApplication.getComponent().inject(this)
        val users = getUserUseCase.getUsers()

        mainView!!.listUsers(users)
    }


    override fun showProgressBar(status: Boolean) {
    }

    override fun setView(view: IMain.MainViewImpl) {
        this.mainView = view
    }


    override fun toast(msg: String) {
      Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }


}