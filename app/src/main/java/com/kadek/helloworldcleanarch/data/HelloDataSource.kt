package com.kadek.helloworldcleanarch.data

import com.kadek.helloworldcleanarch.domain.HelloEntity

class HelloDataSource: IHelloDataSource {
    override fun getHelloFromSource(name: String): HelloEntity {
        return HelloEntity("Hello $name welcome")
    }
}