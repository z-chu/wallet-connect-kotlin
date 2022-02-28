package com.trustwallet.walletconnect.models.session

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class WCSessionUpdate(
    val approved: Boolean,
    val chainId: Int?,
    val accounts: List<String>?
) : Parcelable