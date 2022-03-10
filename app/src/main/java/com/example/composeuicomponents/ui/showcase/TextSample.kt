package com.example.composeuicomponents.ui.showcase

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun GreetingText(greetingMsg: String) {
    Column() {
        Text(greetingMsg, style = MaterialTheme.typography.h1)
        Text(greetingMsg, style = MaterialTheme.typography.h2)
        Text(greetingMsg, style = MaterialTheme.typography.h3)
        Text(greetingMsg, style = MaterialTheme.typography.h4)
        Text(greetingMsg, style = MaterialTheme.typography.h5)
        Text(greetingMsg, style = MaterialTheme.typography.h6)
        Text(greetingMsg, style = MaterialTheme.typography.subtitle1)
        Text(greetingMsg, style = MaterialTheme.typography.subtitle2)
        Text(greetingMsg, style = MaterialTheme.typography.body1)
        Text(greetingMsg, style = MaterialTheme.typography.body2)
        Text(greetingMsg, style = MaterialTheme.typography.button)
        Text(greetingMsg, style = MaterialTheme.typography.caption)
        Text(greetingMsg, style = MaterialTheme.typography.overline)
    }
}