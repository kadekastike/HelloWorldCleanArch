package com.kadek.helloworldcleanarch.domain

interface IHelloRepository {
    fun getHello(name: String): HelloEntity
}