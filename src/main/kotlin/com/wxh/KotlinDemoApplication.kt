package com.wxh

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = [])
class KotlinDemoApplication



fun main(args: Array<String>) {
    runApplication<KotlinDemoApplication>(*args)
}
