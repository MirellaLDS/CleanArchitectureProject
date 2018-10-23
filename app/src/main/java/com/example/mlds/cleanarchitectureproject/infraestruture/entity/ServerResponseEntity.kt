package com.example.mlds.cleanarchitectureproject.infraestruture.entity

data class ServerResponseEntity(val successful: Boolean, val message: ServerMessageEntity, val statusCode: Int)