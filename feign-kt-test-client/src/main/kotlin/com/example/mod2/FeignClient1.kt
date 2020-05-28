package com.example.mod2

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

/**
 * *******************************
 * Created by irina on 3/17/2020.
 * Project: feignTest2
 * *******************************
 */
@FeignClient(name = "kt-test1", url = "http://localhost:8081/kt_test/api")
interface FeignClient1 {
    @GetMapping("/test0/{v1}/bye/{v2}")
    fun m1(@PathVariable v1: String, @PathVariable v2: String): String?
}