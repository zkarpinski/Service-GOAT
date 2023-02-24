package com.zacharykarpinski.servicegoat.controller

import com.zacharykarpinski.servicegoat.model.Config
import com.zacharykarpinski.servicegoat.repository.ConfigRepository
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpResponse.status
import io.micronaut.http.HttpStatus
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import javax.inject.Inject
import javax.validation.Valid


@Controller("/config")
class ConfigController {

    //private val LOGGER: Logger = LoggerFactory.getLogger(EmployeeController::class.java)

    @Inject
    private val configRepository: ConfigRepository?= null

    @Post()
    fun savePerson(@Body config: @Valid Config?): HttpResponse<*>? {
        //LOGGER.info("test")
        this.configRepository?.save(config)
        return status<Any>(HttpStatus.OK).body(this.configRepository?.findAll())
    }

    @Get()
    fun getPersons(): HttpResponse<*>? {
        return status<Any>(HttpStatus.OK).body(this.configRepository?.findAll())
    }
    @Get("/what")
    @Produces(MediaType.TEXT_PLAIN)
    fun getPersons2(): String {
        return "Hi"
    }
}