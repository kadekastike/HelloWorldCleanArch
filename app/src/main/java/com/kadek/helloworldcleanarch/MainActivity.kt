package com.kadek.helloworldcleanarch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.kadek.helloworldcleanarch.databinding.ActivityMainBinding
import com.kadek.helloworldcleanarch.presentation.MainViewModel
import com.kadek.helloworldcleanarch.presentation.ViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val factory = ViewModelFactory.getInstance()
        val viewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]

        viewModel.setName("Kadek Astike")
        viewModel.hello.observe(this, Observer { hello ->
            binding.txtHello.text = hello.hello
        })
    }
}