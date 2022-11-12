package com.gitpher.kotlin2spring.controller

import com.gitpher.kotlin2spring.model.OverviewTransactionModel
import com.gitpher.kotlin2spring.model.TransactionModel
import com.gitpher.kotlin2spring.model.convertToDBModel
import com.gitpher.kotlin2spring.model.convertToOverviewTransactionModel
import com.gitpher.kotlin2spring.repository.TransferRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/transfer")
class TransferController(val repository: TransferRepository) {

    @PostMapping("/new")
    fun newTransfer(@RequestBody transactionModel: TransactionModel) {
        // TODO: SAVE THE DATA
        repository.save(transactionModel.convertToDBModel())
    }

    @GetMapping("/all")
    fun getAllTransfers(): List<OverviewTransactionModel> {
        // TODO: FETCH THE DATA
        return repository.findAll().map { it.convertToOverviewTransactionModel() }
    }

}