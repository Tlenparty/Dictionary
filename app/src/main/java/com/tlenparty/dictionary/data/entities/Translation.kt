package com.tlenparty.dictionary.data.entities

import com.tlenparty.dictionary.helpers.consts.Constants
import com.google.gson.annotations.SerializedName

data class Translation(
    @SerializedName(Constants.TEXT)
    val text: String?,

    @SerializedName(Constants.NOTE)
    val note: String?
)
