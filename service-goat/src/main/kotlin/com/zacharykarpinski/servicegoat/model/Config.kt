package com.zacharykarpinski.servicegoat.model

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.GeneratedValue
import javax.persistence.Entity
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size


@Entity
@Introspected
class Config {
    @Id
    var id: Long? = null
    var name: @NotEmpty(message = "can not be empty") @Size(min = 1, max = 20) String? = null
    var age: @Min(18) Int = 0

    constructor(name: String?, age: Int) {
        this.name = name
        this.age = age
    }

    constructor()
}