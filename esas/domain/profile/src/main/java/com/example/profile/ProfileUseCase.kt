package com.example.profile

import com.example.esas.profile.ProfileRepository
import javax.inject.Inject

class ProfileUseCase @Inject constructor(
    val profileRepository: ProfileRepository
) {

//    fun test() = profileRepository.basketDao.save()
}