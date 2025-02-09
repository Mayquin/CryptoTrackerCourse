package com.plcoding.cryptotracker.crypto.data.networking.dto

import kotlinx.serialization.Serializable

/**
 * Created by Maycon Henrique on 09/02/2025.
 * maycon255@hotmail.com
 */

@Serializable
data class CoinResponseDto(
    val data: List<CoinDto>
)
