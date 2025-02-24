package com.plcoding.cryptotracker.crypto.domain

import java.time.ZonedDateTime

/**
 * Created by Maycon Henrique on 24/02/2025.
 * maycon255@hotmail.com
 */

data class CoinPrice(
    val priceUsd: Double,
    val dateTime: ZonedDateTime
)
