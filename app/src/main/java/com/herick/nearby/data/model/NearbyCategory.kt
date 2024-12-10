package com.herick.nearby.data.model

import androidx.annotation.DrawableRes

data class NearbyCategory(
    val id: String,
    val name: String
) {
    @get:DrawableRes
    val icon: Int?
        get() = NearByCategoryFilterChipView.fromDescription(description = name)?.icon
}
