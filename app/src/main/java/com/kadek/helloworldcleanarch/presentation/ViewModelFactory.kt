package com.kadek.helloworldcleanarch.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kadek.helloworldcleanarch.di.Injection
import com.kadek.helloworldcleanarch.domain.HelloUseCase
import java.lang.IllegalArgumentException

class ViewModelFactory(
    private var helloUseCase: HelloUseCase
) : ViewModelProvider.NewInstanceFactory(){

    companion object {
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(): ViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: ViewModelFactory(Injection.provideUseCase())
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MainViewModel::class.java) -> MainViewModel(helloUseCase) as T
            else -> throw IllegalArgumentException("Unknown Viewmodel" + modelClass.name)
        }
    }
}