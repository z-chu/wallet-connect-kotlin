package com.trustwallet.walletconnect.models.session

import android.os.Parcelable
import com.trustwallet.walletconnect.models.WCPeerMeta
import kotlinx.parcelize.Parcelize

@Parcelize
data class WCApproveSessionResponse(
    val approved: Boolean = true,
    val chainId: Int,
    val accounts: List<String>,
    val peerId: String?,
    val peerMeta: WCPeerMeta?
) : Parcelable