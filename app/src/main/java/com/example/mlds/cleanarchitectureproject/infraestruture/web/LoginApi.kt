package com.example.mlds.cleanarchitectureproject.infraestruture.web

import com.example.mlds.cleanarchitectureproject.domain.model.ServerMessage
import com.example.mlds.cleanarchitectureproject.domain.model.ServerResponse
import com.example.mlds.cleanarchitectureproject.domain.model.UserCredentials
import com.example.mlds.cleanarchitectureproject.infraestruture.helper.RetrofitHelper
import retrofit2.Retrofit

class LoginApi {

    private val loginApi: Retrofit  = RetrofitHelper.createRetrofit("", 15)

    fun request(credentials: UserCredentials): ServerResponse {
        //TODO: Substituir Mock por chamada retrofit
        return ServerResponse(true, ServerMessage("Content"), 200)
    }
}