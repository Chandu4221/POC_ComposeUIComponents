package com.example.composeuicomponents.ui.theme.spacing

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.composeuicomponents.ui.theme.dimensions.FOUR
import com.example.composeuicomponents.ui.theme.dimensions.ONE
import com.example.composeuicomponents.ui.theme.dimensions.ONE_POINT_FIVE
import com.example.composeuicomponents.ui.theme.dimensions.SIX
import com.example.composeuicomponents.ui.theme.dimensions.THREE
import com.example.composeuicomponents.ui.theme.dimensions.TWO
import com.example.composeuicomponents.ui.theme.dimensions.ZERO
import com.example.composeuicomponents.ui.theme.dimensions.ZERO_POINT_FIVE

data class Spacing(
    val none: Dp = ZERO.dp,
    val sm: Dp = ZERO_POINT_FIVE.dp,
    val default: Dp = ONE.dp,
    val md: Dp = ONE_POINT_FIVE.dp,
    val lg: Dp = TWO.dp,
    val xl: Dp = THREE.dp,
    val xxl: Dp = FOUR.dp,
    val xxxl: Dp = SIX.dp
)

val LocalSpacing = compositionLocalOf { Spacing() }

val MaterialTheme.spacing: Spacing
    @Composable
    @ReadOnlyComposable
    get() = LocalSpacing.current