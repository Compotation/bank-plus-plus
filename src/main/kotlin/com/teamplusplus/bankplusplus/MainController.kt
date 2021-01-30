package com.teamplusplus.bankplusplus

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {
    @CrossOrigin(origins = arrayOf("http://localhost", "https://guijunzhang.github.io"))
    @GetMapping("/greeting")
    fun greet(): String {
        return "The server is working"
    }
}