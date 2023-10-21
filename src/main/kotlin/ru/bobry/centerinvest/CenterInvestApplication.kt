package ru.bobry.centerinvest


import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
class CenterInvestApplication
fun main(args: Array<String>) {
    runApplication<CenterInvestApplication>(*args)
}