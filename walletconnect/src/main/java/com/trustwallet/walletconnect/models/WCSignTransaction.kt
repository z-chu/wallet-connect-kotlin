package com.trustwallet.walletconnect.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class WCSignTransaction(
    val network: Int,
    val transaction: String
) : Parcelable