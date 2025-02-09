package com.plcoding.cryptotracker.crypto.domain

import com.plcoding.cryptotracker.core.domain.util.NetworkError
import com.plcoding.cryptotracker.core.domain.util.Result

/**
 * Created by Maycon Henrique on 09/02/2025.
 * maycon255@hotmail.com
 */

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}