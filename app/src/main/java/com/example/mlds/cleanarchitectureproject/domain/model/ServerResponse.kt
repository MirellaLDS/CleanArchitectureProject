package com.example.mlds.cleanarchitectureproject.domain.model

data class ServerResponse(val successful: Boolean, val message: ServerMessage, val statusCode: Int)