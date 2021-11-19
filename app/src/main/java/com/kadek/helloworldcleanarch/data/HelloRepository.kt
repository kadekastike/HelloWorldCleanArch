package com.kadek.helloworldcleanarch.data

import com.kadek.helloworldcleanarch.domain.HelloEntity
import com.kadek.helloworldcleanarch.domain.IHelloRepository

class HelloRepository(private val helloDataSource: IHelloDataSource): IHelloRepository {
    override fun getHello(name: String): HelloEntity {
        return helloDataSource.getHelloFromSource(name)
    }
}