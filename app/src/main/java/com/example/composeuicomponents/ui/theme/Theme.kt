package com.example.composeuicomponents.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import com.example.composeuicomponents.ui.theme.colorPalettes.BLUE_700
import com.example.composeuicomponents.ui.theme.padding.LocalPadding
import com.example.composeuicomponents.ui.theme.padding.P
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorPalette = darkColors(
    primary = Color(0xFFBB86FC),
    primaryVariant = Color(0xFF3700B3),
    secondary = Color(0xFF03DAC6),
    secondaryVariant = Color(0xFF03DAC6),
    background = Color(0xFF121212),
    surface = Color(0xFF121212),
    error = Color(0xFFCF6679),
    onPrimary = Color.Black,
    onSecondary = Color.Black,
    onBackground = Color.White,
    onSurface = Color.White,
    onError = Color.Black
)

private val LightColorPalette = lightColors(
    primary = BLUE_700,
    primaryVariant = Color(0xFF3700B3),
    secondary = Color(0xFF03DAC6),
    secondaryVariant = Color(0xFF018786),
    background = Color.White,
    surface = Color.White,
    error = Color(0xFFB00020),
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    onError = Color.White
)

@Composable
fun ComposeUIComponentsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    val systemUiController = rememberSystemUiController()
    SideEffect {
        systemUiController.setSystemBarsColor(
            color = Color(0xffEE5355),
            darkIcons = true
        )
        systemUiController.setNavigationBarColor(
            color = Color(0xffEE5355),
            darkIcons = true
        )
        systemUiController.setStatusBarColor(
            color = Color(0xffEE5355),
            darkIcons = true
        )
    }

    /*ADD COMPOSITIONS HERE USING THE PROVIDER*/
    CompositionLocalProvider(LocalPadding provides P()) {
        MaterialTheme(
            colors = colors,
            typography = Typography,
            content = content
        )
    }

}