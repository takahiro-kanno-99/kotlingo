package com.example.kotlinbookweb

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping
class Controller{
    @GetMapping("/")
    fun top() :String{
        return "top"
    }
}