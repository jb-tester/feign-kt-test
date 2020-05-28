package com.example.mod2

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * *******************************
 *
 * Created by irina on 26.05.2020.
 *
 * Project: mod2
 * *******************************
 */
@RestController
class ClientController {
    @Autowired
    private val ktTest1: FeignClient1? = null
    @Autowired
    private val ktTest2: FeignClient2? = null
    
    @RequestMapping("/test1")
    fun test1(): String? {
        return ktTest1!!.m1("foo", "bar")
    }
    @RequestMapping("/test2")
    fun test2(): String? {
        return ktTest2!!.m1()
    }
}