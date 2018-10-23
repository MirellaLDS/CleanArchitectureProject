package com.example.mlds.cleanarchitectureproject.presentation.view

interface LoginViewInterface {
    fun showProgress()
    fun hideProgress()
    fun showError(error: String)
}