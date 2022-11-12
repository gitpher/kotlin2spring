package com.gitpher.kotlin2spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
class Kotlin2springApplication

fun main(args: Array<String>) {
    runApplication<Kotlin2springApplication>(*args)
}
