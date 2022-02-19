package com.example.composeuicomponents.ui.theme.padding

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composeuicomponents.ui.theme.dimensions.ONE_DP
import com.example.composeuicomponents.ui.theme.dimensions.ZERO

data class Padding(
    val p0: Modifier = Modifier.padding(ZERO.dp),
    val pDp: Modifier = Modifier.padding(ONE_DP.dp)
)

val LocalPadding = compositionLocalOf { Padding() }

val MaterialTheme.padding: Padding
    @Composable
    @ReadOnlyComposable
    get() = LocalPadding.current