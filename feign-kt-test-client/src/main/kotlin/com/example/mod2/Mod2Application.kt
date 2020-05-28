package com.example.mod2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class Mod2Application

fun main(args: Array<String>) {
	runApplication<Mod2Application>(*args)
}
