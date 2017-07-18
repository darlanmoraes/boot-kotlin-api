package com.kotlin.boot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BootKotlinApiApplication

fun main(args: Array<String>) {
    SpringApplication.run(BootKotlinApiApplication::class.java, *args)
}
