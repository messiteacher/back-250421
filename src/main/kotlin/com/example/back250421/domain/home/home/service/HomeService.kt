package com.example.back250421.domain.home.home.service

import org.springframework.stereotype.Service
import java.lang.Thread.sleep

@Service
class HomeService {

    init {
        sleep(10000)
    }

    fun hello(): String {
        return "Hello, World!"
    }
}