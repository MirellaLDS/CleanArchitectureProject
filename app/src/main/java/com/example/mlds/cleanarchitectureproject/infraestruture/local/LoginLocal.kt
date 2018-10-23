package com.example.mlds.cleanarchitectureproject.infraestruture.local

import com.example.mlds.cleanarchitectureproject.infraestruture.entity.UserEntity

interface LoginLocal {

    fun userEntityList(): List<UserEntity>

    fun userEntity(): UserEntity
}