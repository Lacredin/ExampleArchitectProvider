package com.example.esas.data.ticket

import javax.inject.Inject

class TicketRepository @Inject constructor(
    val ticketDao: TicketDao,
) {
}