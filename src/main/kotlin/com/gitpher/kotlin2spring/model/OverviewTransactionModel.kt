package com.gitpher.kotlin2spring.model

import com.gitpher.kotlin2spring.repository.model.TransactionDBModel
import java.util.Date

class OverviewTransactionModel (
    val targetAccount: String,
    val value1: Double,
    val description: String,
    val date: Date,
    val id: String
)

fun TransactionDBModel.convertToOverviewTransactionModel() = OverviewTransactionModel(
    targetAccount = this.accountIdentifier,
    value1 = this.value1,
    description = this.description,
    date = this.date,
    id = this.id.toString()
)
