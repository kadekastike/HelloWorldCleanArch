package com.kadek.helloworldcleanarch.domain

class HelloInteractor(private val helloRepository: IHelloRepository): HelloUseCase {
    override fun getHello(name: String): HelloEntity {
        return helloRepository.getHello(name)
    }
}