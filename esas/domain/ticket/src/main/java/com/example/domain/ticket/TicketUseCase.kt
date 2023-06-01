package com.example.domain.ticket

import com.example.esas.data.ticket.TicketRepository
import com.example.profile.ProfileUseCase
import javax.inject.Inject

class TicketUseCase @Inject constructor(
    val profileUseCase: ProfileUseCase,
    val ticketRepository: TicketRepository
) {

}