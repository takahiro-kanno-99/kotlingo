package com.example.kotlinbookweb

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping
class Controller{
    @GetMapping("/")
    fun top() :String{
        return "top"
    }
    @PostMapping("/record")
    fun record(@ModelAttribute recordForm: RecordForm) :String{
        System.out.println(recordForm.price)
        System.out.println(recordForm.isConsume)
        System.out.println(recordForm.recordTime)
        return "top"
    }
}