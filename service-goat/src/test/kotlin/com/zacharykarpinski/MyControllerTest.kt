package com.zacharykarpinski

import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

@MicronautTest
class MyControllerTest {
    @Inject
    @field:Client("/")
    lateinit var client : HttpClient

    @Test
    fun testHello() {
        val request: HttpRequest<Any> = HttpRequest.GET("/hello")
        val body = client.toBlocking().retrieve(request)
        Assertions.assertNotNull(body)
        Assertions.assertEquals("Hello World", body)
    }
}