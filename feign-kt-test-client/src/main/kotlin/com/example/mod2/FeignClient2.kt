package com.example.mod2

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

/**
 * *******************************
 * Created by irina on 3/17/2020.
 * Project: feignTest2
 * *******************************
 */
//@FeignClient(name = "\${client.name}", url = "\${client.url}") // with placeholders
//@FeignClient(name = "kt-test2", url = "http://localhost:8081/kt_test/api") // with set server context-path
@FeignClient(name = "kt-test2", url = "http://localhost:8081/") // without server context-path
interface FeignClient2 {
    @GetMapping("/simple/hello")
    fun m1(): String?
}