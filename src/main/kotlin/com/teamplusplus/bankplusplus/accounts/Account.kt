package com.teamplusplus.bankplusplus.accounts

class Account(var name: String, var balance: Double, val transactionList: MutableList<Transaction>) {
}