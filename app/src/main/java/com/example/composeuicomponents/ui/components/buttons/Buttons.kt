package com.example.composeuicomponents.ui.components.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.example.composeuicomponents.ui.theme.colorPalettes.WHITE
import com.example.composeuicomponents.ui.theme.dimensions.BORDER_RADIUS_LG
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_1
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_FIVE
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_SIX
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_THREE
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_THREE_POINT_FIVE
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_TWO
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_TWO_POINT_FIVE
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_ZERO


/* == SIZES ==*/
@Composable
fun ButtonXS(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(BORDER_RADIUS_LG),
    border: BorderStroke? = BorderStroke(DIMEN_ZERO.dp, MaterialTheme.colors.primary),
    backgroundColor: Color = MaterialTheme.colors.primary,
    contentColor: Color = MaterialTheme.colors.onPrimary,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        border = border,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        ),
        contentPadding = PaddingValues(DIMEN_THREE.dp, DIMEN_TWO.dp),
        content = content
    )
}

@Composable
fun ButtonSM(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(BORDER_RADIUS_LG),
    border: BorderStroke? = BorderStroke(DIMEN_ZERO.dp, MaterialTheme.colors.primary),
    backgroundColor: Color = MaterialTheme.colors.primary,
    contentColor: Color = MaterialTheme.colors.onPrimary,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        border = border,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        ),
        contentPadding = PaddingValues(DIMEN_THREE.dp, DIMEN_TWO.dp),
        content = content
    )
}

@Composable
fun ButtonDefault(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(BORDER_RADIUS_LG),
    border: BorderStroke? = BorderStroke(DIMEN_ZERO.dp, MaterialTheme.colors.primary),
    backgroundColor: Color = MaterialTheme.colors.primary,
    contentColor: Color = MaterialTheme.colors.onPrimary,
    contentPadding: PaddingValues = PaddingValues(DIMEN_FIVE.dp, DIMEN_TWO_POINT_FIVE.dp),
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
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
    shape: Shape = RoundedCornerShape(BORDER_RADIUS_LG),
    border: BorderStroke? = BorderStroke(DIMEN_ZERO.dp, MaterialTheme.colors.primary),
    backgroundColor: Color = MaterialTheme.colors.primary,
    contentColor: Color = MaterialTheme.colors.onPrimary,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        border = border,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        ),
        contentPadding = PaddingValues(DIMEN_FIVE.dp, DIMEN_THREE.dp),
        content = content
    )
}


@Composable
fun ButtonXL(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(BORDER_RADIUS_LG),
    border: BorderStroke? = BorderStroke(DIMEN_ZERO.dp, MaterialTheme.colors.primary),
    backgroundColor: Color = MaterialTheme.colors.primary,
    contentColor: Color = MaterialTheme.colors.onPrimary,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        border = border,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        ),
        contentPadding = PaddingValues(DIMEN_SIX.dp, DIMEN_THREE_POINT_FIVE.dp),
        content = content
    )
}


@Composable
fun ButtonOutline(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(BORDER_RADIUS_LG),
    borderColor: Color = MaterialTheme.colors.primary,
    contentColor: Color = MaterialTheme.colors.primary,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        border = BorderStroke(DIMEN_1.dp, borderColor),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = WHITE,
            contentColor = contentColor
        ),
        contentPadding = PaddingValues(DIMEN_THREE.dp, DIMEN_TWO.dp),
        content = content
    )
}
