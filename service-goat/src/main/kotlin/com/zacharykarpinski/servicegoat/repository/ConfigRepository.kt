package com.zacharykarpinski.servicegoat.repository

import com.zacharykarpinski.servicegoat.model.Config

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository


@Repository
open interface ConfigRepository : CrudRepository<Config?, Long?>