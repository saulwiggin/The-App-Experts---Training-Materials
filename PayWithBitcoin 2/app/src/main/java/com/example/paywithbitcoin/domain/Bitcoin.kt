package com.example.paywithbitcoin.domain

import com.fasterxml.jackson.module.kotlin.*

data class Bitcoin (
     var price: String,
     val coin: String,
     val currency: String
)

val mapper = jacksonObjectMapper()