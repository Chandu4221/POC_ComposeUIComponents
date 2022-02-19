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
import androidx.compose.ui.unit.dp
import com.example.composeuicomponents.ui.theme.colorPalettes.WHITE
import com.example.composeuicomponents.ui.theme.dimensions.FIVE
import com.example.composeuicomponents.ui.theme.dimensions.ONE_DP
import com.example.composeuicomponents.ui.theme.dimensions.SIX
import com.example.composeuicomponents.ui.theme.dimensions.THREE
import com.example.composeuicomponents.ui.theme.dimensions.THREE_POINT_FIVE
import com.example.composeuicomponents.ui.theme.dimensions.TWO
import com.example.composeuicomponents.ui.theme.dimensions.TWO_POINT_FIVE
import com.example.composeuicomponents.ui.theme.dimensions.ZERO


/* == SIZES ==*/
@Composable
fun ButtonXS(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
//    shape: Shape = RoundedCornerShape(BORDER_RADIUS_LG),
    border: BorderStroke? = BorderStroke(ZERO.dp, MaterialTheme.colors.primary),
    backgroundColor: Color = MaterialTheme.colors.primary,
    contentColor: Color = MaterialTheme.colors.onPrimary,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
//        shape = shape,
        border = border,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        ),
        contentPadding = PaddingValues(THREE.dp, TWO.dp),
        content = content
    )
}

@Composable
fun ButtonSM(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
//    shape: Shape = RoundedCornerShape(BORDER_RADIUS_LG),
    border: BorderStroke? = BorderStroke(ZERO.dp, MaterialTheme.colors.primary),
    backgroundColor: Color = MaterialTheme.colors.primary,
    contentColor: Color = MaterialTheme.colors.onPrimary,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
//        shape = shape,
        border = border,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        ),
        contentPadding = PaddingValues(THREE.dp, TWO.dp),
        content = content
    )
}

@Composable
fun ButtonDefault(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
//    shape: Shape = RoundedCornerShape(BORDER_RADIUS_LG),
    border: BorderStroke? = BorderStroke(ZERO.dp, MaterialTheme.colors.primary),
    backgroundColor: Color = MaterialTheme.colors.primary,
    contentColor: Color = MaterialTheme.colors.onPrimary,
    contentPadding: PaddingValues = PaddingValues(FIVE.dp, TWO_POINT_FIVE.dp),
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
//        shape = shape,
        border = border,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        ),
        contentPadding = contentPadding,
        content = content,
    )
}

@Composable
fun ButtonLG(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
//    shape: Shape = RoundedCornerShape(BORDER_RADIUS_LG),
    border: BorderStroke? = BorderStroke(ZERO.dp, MaterialTheme.colors.primary),
    backgroundColor: Color = MaterialTheme.colors.primary,
    contentColor: Color = MaterialTheme.colors.onPrimary,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
//        shape = shape,
        border = border,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        ),
        contentPadding = PaddingValues(FIVE.dp, THREE.dp),
        content = content
    )
}


@Composable
fun ButtonXL(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
//    shape: Shape = RoundedCornerShape(BORDER_RADIUS_LG),
    border: BorderStroke? = BorderStroke(ZERO.dp, MaterialTheme.colors.primary),
    backgroundColor: Color = MaterialTheme.colors.primary,
    contentColor: Color = MaterialTheme.colors.onPrimary,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
//        shape = shape,
        border = border,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        ),
        contentPadding = PaddingValues(SIX.dp, THREE_POINT_FIVE.dp),
        content = content
    )
}


@Composable
fun ButtonOutline(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
//    shape: Shape = RoundedCornerShape(BORDER_RADIUS_LG),
    borderColor: Color = MaterialTheme.colors.primary,
    contentColor: Color = MaterialTheme.colors.primary,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
//        shape = shape,
        border = BorderStroke(ONE_DP.dp, borderColor),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = WHITE,
            contentColor = contentColor
        ),
        contentPadding = PaddingValues(THREE.dp, TWO.dp),
        content = content
    )
}
