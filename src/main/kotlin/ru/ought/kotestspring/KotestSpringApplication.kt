package ru.ought.kotestspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotestSpringApplication

fun main(args: Array<String>) {
    runApplication<KotestSpringApplication>(*args)
}
