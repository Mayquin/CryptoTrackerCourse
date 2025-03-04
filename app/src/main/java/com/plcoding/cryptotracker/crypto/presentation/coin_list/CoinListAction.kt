package com.plcoding.cryptotracker.crypto.presentation.coin_list

import com.plcoding.cryptotracker.crypto.presentation.coin_list.models.CoinUI

/**
 * Created by Maycon Henrique on 09/02/2025.
 * maycon255@hotmail.com
 */

sealed interface CoinListAction {
    data class OnCoinClick(val coinUI: CoinUI) : CoinListAction
}