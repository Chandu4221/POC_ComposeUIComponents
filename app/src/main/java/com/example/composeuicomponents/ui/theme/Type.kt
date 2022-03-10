package com.example.composeuicomponents.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.composeuicomponents.R

// custom fonts using material design typography styles
// https://lh3.googleusercontent.com/GhGMLbfqPXdUgmnflT52VWNSned4U5jLOpTIXZWEDQfwvZGZC2EI0iO0wKxptigoYW79v2PhIdmjTjWDgfdHF8TzcldhSc9pA4BBLhE=w

val interFontFamily = FontFamily(
    Font(R.font.inter_light_300, weight = FontWeight.W300),
    Font(R.font.inter_regular_400, weight = FontWeight.W400),
    Font(R.font.inter_medium_500, weight = FontWeight.W500),
    Font(R.font.inter_semibold_600, weight = FontWeight.W600),
    Font(R.font.inter_bold_700, weight = FontWeight.W700)
)

val Typography = Typography(
    defaultFontFamily = interFontFamily,
)
