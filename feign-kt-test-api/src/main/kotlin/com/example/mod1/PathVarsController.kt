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
@RequestMapping("/test0/{top}")
class PathVarsController {
    @RequestMapping("/hello/{name}")
    fun hello(@PathVariable name: String, @PathVariable top: String): String {
        return "$top hello $name"
    }

    @RequestMapping("/bye/{name}")
    fun bye(@PathVariable name: String, @PathVariable top: String): String {
        return "$top bye $name"
    }
}