package com.gitpher.kotlin2spring.model

import com.gitpher.kotlin2spring.repository.model.TransactionDBModel

class TransactionModel (
    val targetAccount: String,
    val value1: Double,
    val description: String = ""
)

fun TransactionModel.convertToDBModel() = TransactionDBModel(
    accountIdentifier = this.targetAccount,
    value1 = this.value1,
    description = this.description
)