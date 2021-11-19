package com.kadek.helloworldcleanarch.di

import com.kadek.helloworldcleanarch.data.HelloDataSource
import com.kadek.helloworldcleanarch.data.HelloRepository
import com.kadek.helloworldcleanarch.data.IHelloDataSource
import com.kadek.helloworldcleanarch.domain.HelloInteractor
import com.kadek.helloworldcleanarch.domain.HelloUseCase
import com.kadek.helloworldcleanarch.domain.IHelloRepository

object Injection {
    fun provideUseCase(): HelloUseCase {
        val helloRepository = provideRepository()
        return HelloInteractor(helloRepository)
    }

    private fun provideRepository(): IHelloRepository {
        val helloDataSource = provideDataSource()
        return HelloRepository(helloDataSource)
    }

    private fun provideDataSource(): IHelloDataSource {
        return HelloDataSource()
    }
}