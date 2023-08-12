package com.example.a30dias.model
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Sugerencia(
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)
