package com.example.installer

import com.example.api.EsasRestApi
import javax.inject.Inject

class BasketRepository @Inject constructor(
    val basketDao: BasketDao,
    val apiEsas: EsasRestApi
) {


}