package com.example.installer

class BasketUseCase(
    val basketRepository: BasketRepository = BasketRepository()
) {

    fun test() = basketRepository.basketDao.save()
}