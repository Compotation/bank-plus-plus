package com.teamplusplus.bankplusplus.accounts

import java.time.LocalDateTime

data class Transaction(val date: LocalDateTime, val amount: Double, val merchant: String)
