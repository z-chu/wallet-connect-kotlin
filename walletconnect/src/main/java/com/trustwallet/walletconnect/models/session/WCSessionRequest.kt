package com.trustwallet.walletconnect.models.session

import android.os.Parcelable
import com.trustwallet.walletconnect.models.WCPeerMeta
import kotlinx.parcelize.Parcelize

@Parcelize
data class WCSessionRequest(
    val peerId: String,
    val peerMeta: WCPeerMeta,
    val chainId: String?
) : Parcelable