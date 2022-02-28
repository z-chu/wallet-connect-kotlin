package com.trustwallet.walletconnect.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class WCAccount(
    val network: Int,
    val address: String
) : Parcelable