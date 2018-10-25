package com.example.mlds.cleanarchitectureproject.domain.component

import com.example.mlds.cleanarchitectureproject.domain.useCases.GetUserUseCase
import com.example.mlds.cleanarchitectureproject.domain.module.GetUserCaseModule
import com.example.mlds.cleanarchitectureproject.presentation.mvp.login.LoginPresenter
import com.example.mlds.cleanarchitectureproject.presentation.mvp.main.MainPresenter
import dagger.Component


@Component(modules = [GetUserCaseModule::class]) //modulos acessíveis por esse componente
interface MagicBox {
    fun inject(loginPresenter: LoginPresenter)//quem pode utilizar esse módulos
    fun inject(getUserUseCase: GetUserUseCase)//quem pode utilizar esse módulos
    fun inject(mainPresenter: MainPresenter)//quem pode utilizar esse módulos
//    fun inject(cleanApplication: CleanApplication)//quem pode utilizar esse módulos
}