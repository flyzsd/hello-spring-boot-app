package com.shudong.spring.boot.hello_spring_boot_app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloSpringBootAppApplication

fun main(args: Array<String>) {
	runApplication<HelloSpringBootAppApplication>(*args)
}
