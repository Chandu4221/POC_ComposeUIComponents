package com.example.composeuicomponents.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.composeuicomponents.R

// Set of Material typography styles to start with

// custom fonts using material design typography styles
// https://lh3.googleusercontent.com/GhGMLbfqPXdUgmnflT52VWNSned4U5jLOpTIXZWEDQfwvZGZC2EI0iO0wKxptigoYW79v2PhIdmjTjWDgfdHF8TzcldhSc9pA4BBLhE=w

val fonts = FontFamily(
    Font(R.font.inter_light_300, weight = FontWeight.Light),
    Font(R.font.inter_regular_400, weight = FontWeight.Normal),
    Font(R.font.inter_medium_500, weight = FontWeight.Medium),
    Font(R.font.inter_semibold_600, weight = FontWeight.SemiBold),
    Font(R.font.inter_bold_700, weight = FontWeight.Bold)
)

val defaultTypography: Typography = Typography()

val Typography = Typography(
    h1 = defaultTypography.h1.copy(
        fontFamily = fonts,
        fontSize = 79.sp,
    ),
    h2 = defaultTypography.h2.copy(
        fontFamily = fonts,
        fontSize = 50.sp,
    ),
    h3 = defaultTypography.h3.copy(
        fontFamily = fonts,
        fontSize = 40.sp,
    ),
    h4 = defaultTypography.h4.copy(
        fontFamily = fonts,
        fontSize = 28.sp,
    ),
    h5 = defaultTypography.h5.copy(
        fontFamily = fonts,
        fontSize = 20.sp,
    ),
    h6 = defaultTypography.h6.copy(
        fontFamily = fonts,
        fontSize = 17.sp,
    ),
    subtitle1 = defaultTypography.subtitle1.copy(
        fontFamily = fonts,
        fontSize = 13.sp,
    ),
    subtitle2 = defaultTypography.subtitle2.copy(
        fontFamily = fonts,
        fontSize = 12.sp,
    ),
    body1 = defaultTypography.body1.copy(
        fontFamily = fonts,
        fontSize = 13.sp,
    ),
    body2 = defaultTypography.body2.copy(
        fontFamily = fonts,
        fontSize = 12.sp,
    ),
    button = defaultTypography.button.copy(
        fontFamily = fonts,
        fontSize = 12.sp,
    ),
    caption = defaultTypography.caption.copy(
        fontFamily = fonts,
        fontSize = 10.sp,
    ),
    overline = defaultTypography.overline.copy(
        fontFamily = fonts,
        fontSize = 8.sp,
    ),
)

//
//val Typography = Typography(
//    h1 = defaultTypography.h1.copy(
//        fontFamily = fonts,
//        fontSize = 79.sp,
//        fontWeight = FontWeight.Light
//    ),
//    h2 = TextStyle(fontFamily = fonts),
//    h3 = TextStyle(fontFamily = fonts),
//    h4 = TextStyle(fontFamily = fonts),
//    h5 = TextStyle(fontFamily = fonts),
//    h6 = TextStyle(fontFamily = fonts),
//    subtitle1 = TextStyle(fontFamily = fonts),
//    subtitle2 = TextStyle(fontFamily = fonts),
//    body1 = TextStyle(fontFamily = fonts),
//    body2 = TextStyle(fontFamily = fonts),
//    button = TextStyle(fontFamily = fonts),
//    caption = TextStyle(fontFamily = fonts),
//    overline = TextStyle(fontFamily = fonts),
//)