package com.kadek.helloworldcleanarch.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kadek.helloworldcleanarch.domain.HelloEntity
import com.kadek.helloworldcleanarch.domain.HelloUseCase

class MainViewModel(private val helloUseCase: HelloUseCase): ViewModel() {
    private val _hello = MutableLiveData<HelloEntity>()
    val hello: LiveData<HelloEntity>
        get() = _hello

    fun setName(name: String) {
        _hello.value = helloUseCase.getHello(name)
    }
}