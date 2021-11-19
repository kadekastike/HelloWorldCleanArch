package com.kadek.helloworldcleanarch.data

import com.kadek.helloworldcleanarch.domain.HelloEntity

interface IHelloDataSource {
    fun getHelloFromSource(name: String): HelloEntity
}