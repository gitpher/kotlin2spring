package com.gitpher.kotlin2spring.repository

import com.gitpher.kotlin2spring.repository.model.TransactionDBModel
import org.springframework.data.repository.CrudRepository
import java.util.*

interface TransferRepository : CrudRepository<TransactionDBModel, UUID>