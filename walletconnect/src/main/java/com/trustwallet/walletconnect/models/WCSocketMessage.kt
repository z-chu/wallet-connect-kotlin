package com.trustwallet.walletconnect.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class WCSocketMessage(
    val topic: String,
    val type: MessageType,
    val payload: String
) : Parcelable