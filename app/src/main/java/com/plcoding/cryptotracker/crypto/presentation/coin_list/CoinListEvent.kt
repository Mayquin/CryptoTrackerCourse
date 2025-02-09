package com.plcoding.cryptotracker.crypto.presentation.coin_list

import com.plcoding.cryptotracker.core.domain.util.NetworkError

/**
 * Created by Maycon Henrique on 09/02/2025.
 * maycon255@hotmail.com
 */

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}