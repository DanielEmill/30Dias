package com.example.a30dias.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.a30dias.R

val sriracha = FontFamily(
    Font(R.font.sriracha_regular, FontWeight.Normal),
    )
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = sriracha,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)