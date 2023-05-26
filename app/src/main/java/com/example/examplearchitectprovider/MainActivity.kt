package com.example.examplearchitectprovider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.examplearchitectprovider.databinding.ActivityMainBinding
import com.example.examplearchitectprovider.di.DI
import com.example.installer.BasketRepository
import com.example.installer.BasketUseCase
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    init {
        DI.components.esasComponent.inject(this)
        DI.components.basketComponent.inject(this)
    }

    @Inject
    lateinit var basketUseCase: BasketUseCase

    @Inject
    lateinit var basketRepository: BasketRepository

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        // MainTest().mainTest()
        val res = basketUseCase.test()
        res
    }
}