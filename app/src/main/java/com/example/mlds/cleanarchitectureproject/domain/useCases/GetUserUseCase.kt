package com.example.mlds.cleanarchitectureproject.domain.useCases

import com.example.mlds.cleanarchitectureproject.domain.model.User
import com.example.mlds.cleanarchitectureproject.infraestruture.repository.UserRepository
import com.example.mlds.cleanarchitectureproject.infraestruture.repository.UserRepositoryInteractor
import com.example.mlds.cleanarchitectureproject.presentation.presenter.LoginPresenter
import com.example.mlds.cleanarchitectureproject.presentation.view.CleanApplication
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject

interface GetUserUseCaseInteractor {
    fun getUsers(): List<User>
}

class GetUserUseCase @Inject constructor(): GetUserUseCaseInteractor {

    @Inject
    lateinit var userRepositoryInteractor: UserRepositoryInteractor

    override fun getUsers(): List<User> {
//        return userRepositoryInteractor.list()
//        DaggerMagicBox.create().inject(this)
        userRepositoryInteractor.list()
        return listOf(User("Mirella", "mlds", "321456"))
    }

}

@Module
class GetUserCaseModule {
    @Provides
    fun getUsers(): GetUserUseCaseInteractor {
        return GetUserUseCase()
    }

    @Provides
    fun list(): UserRepositoryInteractor {
        return UserRepository()
    }

}

@Component(modules = [GetUserCaseModule::class]) //modulos acessíveis por esse componente
interface MagicBox {
    fun inject(loginPresenter: LoginPresenter)//quem pode utilizar esse módulos
    fun inject(getUserUseCase: GetUserUseCase)//quem pode utilizar esse módulos
//    fun inject(cleanApplication: CleanApplication)//quem pode utilizar esse módulos
}

