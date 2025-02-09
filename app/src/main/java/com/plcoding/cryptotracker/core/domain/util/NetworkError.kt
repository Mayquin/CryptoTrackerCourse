package com.plcoding.cryptotracker.core.domain.util

/**
 * Created by Maycon Henrique on 09/02/2025.
 * maycon255@hotmail.com
 */
enum class NetworkError: Error {
    REQUEST_TIMEOUT,
    TOO_MANY_REQUESTS,
    NO_INTERNET,
    SERVER_ERROR,
    SERIALIZATION,
    UNKNOWN,
}