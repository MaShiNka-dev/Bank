package tv.codealong.tutorials.springboot.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello")
class HelloWorldController {

    @GetMapping("/SpringBoot")
    fun helloWorld(): String{
        return "<h1>Hello, World! The REST API is endpoint<h1>"
    }
}