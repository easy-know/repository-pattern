package com.paul

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RepositoryPatternApplication

fun main(args: Array<String>) {
    runApplication<RepositoryPatternApplication>(*args)
}
