package com.example.composeuicomponents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeuicomponents.ui.theme.ComposeUIComponentsTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeUIComponentsTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("text")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column() {
        Text(text = "h1 $name", style = MaterialTheme.typography.h1)
        Text(text = "h2 $name", style = MaterialTheme.typography.h2)
        Text(text = "h3 $name", style = MaterialTheme.typography.h3)
        Text(text = "h4 $name", style = MaterialTheme.typography.h4)
        Text(text = "h5 $name", style = MaterialTheme.typography.h5)
        Text(text = "h6 $name", style = MaterialTheme.typography.h6)
        Text(text = "Subtitle1 $name", style = MaterialTheme.typography.subtitle1)
        Text(text = "Subtitle2 $name", style = MaterialTheme.typography.subtitle2)
        Text(text = "Body1 $name", style = MaterialTheme.typography.body1)
        Text(text = "Body2 $name", style = MaterialTheme.typography.body2)
        Text(text = "Button $name", style = MaterialTheme.typography.button)
        Text(text = "Caption $name", style = MaterialTheme.typography.caption)
        Text(text = "Overline $name", style = MaterialTheme.typography.overline)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeUIComponentsTheme {
        Greeting("size")
    }
}