package com.plcoding.cryptotracker.crypto.data.networking.dto

import kotlinx.serialization.Serializable

/**
 * Created by Maycon Henrique on 24/02/2025.
 * maycon255@hotmail.com
 */

@Serializable
data class CoinHistoryDto(
    val data: List<CoinPriceDto>
)
