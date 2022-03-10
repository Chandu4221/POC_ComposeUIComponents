package com.example.composeuicomponents.ui.showcase

import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.composeuicomponents.ui.theme.padding.padding

@Composable
fun ButtonWithPadding() {
    Button(
        onClick = { /*TODO*/ },
    ) {
        Text(text = "Button", modifier = MaterialTheme.run {
            padding.px16
            padding.py12
        })
    }
}