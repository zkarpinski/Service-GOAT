package com.zacharykarpinski.servicegoat.model

class Message {
    var code = 0
    var message: String? = null

    constructor(code: Int, message: String?) {
        this.code = code
        this.message = message
    }

    constructor()
}