package com.example.installer

import com.example.api.RestApiEsas
import javax.inject.Inject

class BasketRepository @Inject constructor(
    val basketDao: BasketDao,
    val apiEsas: RestApiEsas
) {


}