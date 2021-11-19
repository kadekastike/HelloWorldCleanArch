package com.kadek.helloworldcleanarch.domain

interface HelloUseCase {
    fun getHello(name: String) : HelloEntity
}