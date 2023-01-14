package com.zacharykarpinski

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/hello")
class MyController {

    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    fun index(): String {
        return "Hello World"
    }

    @Get("/info")
    @Produces(MediaType.TEXT_PLAIN)
    fun info(): String {
        return "Created by: Zachary Karpinski"
    }
}