package com.example.esas.profile

import com.example.api.EsasProfileRestApi
import javax.inject.Inject

class ProfileRepository @Inject constructor(
    val basketDao: ProfileDao,
    val apiEsas: EsasProfileRestApi
) {


}