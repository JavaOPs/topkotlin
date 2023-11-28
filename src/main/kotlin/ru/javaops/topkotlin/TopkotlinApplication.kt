package ru.javaops.topkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TopkotlinApplication

fun main(args: Array<String>) {
    runApplication<TopkotlinApplication>(*args)
}
