package com.plcoding.cryptotracker.crypto.domain

/**
 * Created by Maycon Henrique on 08/02/2025.
 * maycon255@hotmail.com
 */

data class Coin(
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCapUsd: Double,
    val priceUsd: Double,
    val changePercent24Hr: Double
)
