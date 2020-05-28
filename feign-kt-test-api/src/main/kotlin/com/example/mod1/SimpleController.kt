package com.example.mod1

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * *******************************
 * Created by irina on 3/17/2020.
 * Project: feignTest2
 * *******************************
 */
@RestController
@RequestMapping("/")
class SimpleController {
    @RequestMapping("/simple/hello")
    fun hello(): String {
        return "hello"
    }

    @RequestMapping("/simple/bye")
    fun bye(): String {
        return "bye"
    }
}