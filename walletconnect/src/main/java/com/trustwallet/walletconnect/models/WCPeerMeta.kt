package com.trustwallet.walletconnect.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class WCPeerMeta (
    val name: String,
    val url: String,
    val description: String? = null,
    val icons: List<String> = listOf("")
) : Parcelable