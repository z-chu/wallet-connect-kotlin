package com.trustwallet.walletconnect.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class WCEncryptionPayload(
    val data: String,
    val hmac: String,
    val iv: String
) : Parcelable