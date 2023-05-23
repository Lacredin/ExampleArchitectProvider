package com.example.installer

import javax.inject.Inject

class BasketUseCase @Inject constructor(
    val basketRepository: BasketRepository
) {

    fun test() = basketRepository.basketDao.save()
}