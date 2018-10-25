package com.example.mlds.cleanarchitectureproject.presentation.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.mlds.cleanarchitectureproject.R
import com.example.mlds.cleanarchitectureproject.domain.model.User
import com.example.mlds.cleanarchitectureproject.presentation.mvp.login.ILogin
import com.example.mlds.cleanarchitectureproject.presentation.mvp.login.LoginPresenter
import com.example.mlds.cleanarchitectureproject.presentation.mvp.main.IMain
import com.example.mlds.cleanarchitectureproject.presentation.mvp.main.MainPresenter
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity(), IMain.MainViewImpl {

    private var mainPresenter: IMain.MainPresenterImpl? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        if (mainPresenter == null) {
            mainPresenter = MainPresenter(this)
        }

        mainPresenter!!.setView(this)

        mainPresenter!!.getListUsers()
    }

    override fun listUsers(users: ArrayList<User>) {

        val usersAdapter = ArrayAdapter<User>(this, android.R.layout.simple_list_item_1, users)
        lv_users.adapter = usersAdapter
    }
}
