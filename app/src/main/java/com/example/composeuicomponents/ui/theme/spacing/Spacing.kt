package com.example.composeuicomponents.ui.theme.spacing

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_FOUR
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_ONE
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_ONE_POINT_FIVE
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_SIX
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_THREE
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_TWO
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_ZERO
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_ZERO_POINT_FIVE

data class Spacing(
    val none: Dp = DIMEN_ZERO.dp,
    val sm: Dp = DIMEN_ZERO_POINT_FIVE.dp,
    val default: Dp = DIMEN_ONE.dp,
    val md: Dp = DIMEN_ONE_POINT_FIVE.dp,
    val lg: Dp = DIMEN_TWO.dp,
    val xl: Dp = DIMEN_THREE.dp,
    val xxl: Dp = DIMEN_FOUR.dp,
    val xxxl: Dp = DIMEN_SIX.dp
)

val LocalSpacing = compositionLocalOf { Spacing() }

val MaterialTheme.spacing: Spacing
    @Composable
    @ReadOnlyComposable
    get() = LocalSpacing.current