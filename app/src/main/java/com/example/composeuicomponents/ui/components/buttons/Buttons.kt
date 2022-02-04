package com.example.composeuicomponents.ui.components.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.composeuicomponents.ui.theme.colorPalettes.WHITE
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_1
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_10
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_12
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_14
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_20
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_24
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_8

@Composable
fun ButtonDefault(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    backgroundColor: Color = MaterialTheme.colors.primary,
    contentColor: Color = MaterialTheme.colors.onPrimary,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        ),
        contentPadding = PaddingValues(DIMEN_20, DIMEN_10),
        content = content
    )
}

@Composable
fun ButtonOutline(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    borderColor: Color = MaterialTheme.colors.primary,
    contentColor: Color = MaterialTheme.colors.primary,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        border = BorderStroke(DIMEN_1, borderColor),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = WHITE,
            contentColor = contentColor
        ),
        contentPadding = PaddingValues(DIMEN_20, DIMEN_10),
        content = content
    )
}

/* == SIZES ==*/
@Composable
fun ButtonXS(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    backgroundColor: Color = MaterialTheme.colors.primary,
    contentColor: Color = MaterialTheme.colors.onPrimary,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        ),
        contentPadding = PaddingValues(DIMEN_12, DIMEN_8),
        content = content
    )
}

@Composable
fun ButtonSM(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    backgroundColor: Color = MaterialTheme.colors.primary,
    contentColor: Color = MaterialTheme.colors.onPrimary,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        ),
        contentPadding = PaddingValues(DIMEN_12, DIMEN_8),
        content = content
    )
}

@Composable
fun ButtonLG(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    backgroundColor: Color = MaterialTheme.colors.primary,
    contentColor: Color = MaterialTheme.colors.onPrimary,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        ),
        contentPadding = PaddingValues(DIMEN_20, DIMEN_12),
        content = content
    )
}


@Composable
fun ButtonXL(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    backgroundColor: Color = MaterialTheme.colors.primary,
    contentColor: Color = MaterialTheme.colors.onPrimary,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        ),
        contentPadding = PaddingValues(DIMEN_24, DIMEN_14),
        content = content
    )
}