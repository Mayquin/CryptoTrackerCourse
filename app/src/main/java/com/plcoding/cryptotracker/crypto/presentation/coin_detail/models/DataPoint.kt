package com.plcoding.cryptotracker.crypto.presentation.coin_detail.models

import com.plcoding.cryptotracker.crypto.domain.CoinPrice
import java.time.format.DateTimeFormatter

/**
 * Created by Maycon Henrique on 04/03/2025.
 * maycon255@hotmail.com
 */

data class DataPoint(
    val x: Float,
    val y: Float,
    val xLabel: String
)


fun CoinPrice.toDataPoint(): DataPoint {
    return DataPoint(
        x = dateTime.hour.toFloat(),
        y = priceUsd.toFloat(),
        xLabel = DateTimeFormatter
            .ofPattern("ha\nd/M")
            .format(dateTime)
    )
}