package com.example.composeuicomponents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeuicomponents.ui.components.buttons.ButtonDefault
import com.example.composeuicomponents.ui.components.buttons.ButtonLG
import com.example.composeuicomponents.ui.components.buttons.ButtonOutline
import com.example.composeuicomponents.ui.components.buttons.ButtonSM
import com.example.composeuicomponents.ui.components.buttons.ButtonXL
import com.example.composeuicomponents.ui.components.buttons.ButtonXS
import com.example.composeuicomponents.ui.theme.ComposeUIComponentsTheme
import com.example.composeuicomponents.ui.theme.dimensions.BORDER_RADIUS_LG
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_FIVE
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_FOUR
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_ONE
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_TWO
import com.example.composeuicomponents.ui.theme.dimensions.DIMEN_TWO_POINT_FIVE
import com.example.composeuicomponents.ui.theme.dimensions.FONT_DIMEN_BASE
import com.example.composeuicomponents.ui.theme.dimensions.FONT_DIMEN_SM
import com.example.composeuicomponents.ui.theme.dimensions.FONT_DIMEN_XS
import com.example.composeuicomponents.ui.theme.dimensions.LINE_HEIGHT_BASE
import com.example.composeuicomponents.ui.theme.dimensions.LINE_HEIGHT_SM
import com.example.composeuicomponents.ui.theme.dimensions.LINE_HEIGHT_XS

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeUIComponentsTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Buttons()
                }
            }
        }

    }

    @Composable
    private fun Buttons() {
        Column(modifier = Modifier.padding(DIMEN_ONE.dp)) {
            Spacer(modifier = Modifier.height(5.dp))
            ButtonXS(
                onClick = { /*TODO*/ },
            ) {
                Text(
                    text = "Extra Small",
                    fontSize = FONT_DIMEN_XS,
                    lineHeight = LINE_HEIGHT_XS,
                    fontWeight = FontWeight.Medium
                )
            }
            Spacer(modifier = Modifier.height(5.dp))
            ButtonSM(onClick = { /*TODO*/ }) {
                Text(
                    text = "Small",
                    fontSize = FONT_DIMEN_SM,
                    lineHeight = LINE_HEIGHT_SM,
                    fontWeight = FontWeight.Medium
                )
            }
            Spacer(modifier = Modifier.height(5.dp))
            ButtonDefault(onClick = { /*TODO*/ }) {
                Text(
                    text = "Base",
                    fontSize = FONT_DIMEN_SM,
                    lineHeight = LINE_HEIGHT_SM,
                    fontWeight = FontWeight.Medium
                )
            }
            Spacer(modifier = Modifier.height(5.dp))
            ButtonLG(onClick = { /*TODO*/ }) {
                Text(
                    text = "Large",
                    fontSize = FONT_DIMEN_BASE,
                    lineHeight = LINE_HEIGHT_BASE,
                    fontWeight = FontWeight.Medium
                )
            }
            Spacer(modifier = Modifier.height(5.dp))
            ButtonXL(onClick = { /*TODO*/ }) {
                Text(
                    text = "Extra Large",
                    fontSize = FONT_DIMEN_BASE,
                    lineHeight = LINE_HEIGHT_BASE,
                    fontWeight = FontWeight.Medium
                )
            }
            Spacer(modifier = Modifier.height(5.dp))
            ButtonDefault(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(BORDER_RADIUS_LG),
                contentPadding = PaddingValues(
                    start = DIMEN_FOUR.dp,
                    top = DIMEN_TWO_POINT_FIVE.dp,
                    bottom = DIMEN_TWO_POINT_FIVE.dp,
                    end = DIMEN_FIVE.dp
                )
            ) {
                Icon(
                    imageVector = Icons.Filled.ShoppingCart,
                    contentDescription = "Shopping Cart",
                    modifier = Modifier
                        .height(DIMEN_FIVE.dp)
                        .width(DIMEN_FIVE.dp)
                )
                Text(
                    text = "Buy now",
                    fontSize = FONT_DIMEN_SM,
                    lineHeight = LINE_HEIGHT_SM,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(start = DIMEN_TWO.dp)
                )
            }
            Spacer(modifier = Modifier.height(5.dp))
            ButtonOutline(onClick = { /*TODO*/ }) {
                Text(
                    text = "Outline",
                    fontSize = FONT_DIMEN_SM,
                    lineHeight = LINE_HEIGHT_SM,
                    fontWeight = FontWeight.Medium
                )
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
        Column() {
            ButtonDefault(onClick = { /*TODO*/ }, modifier = Modifier.padding()) {
                Text(text = "Default Button".uppercase())
            }
            ButtonOutline(onClick = { /*TODO*/ }) {
                Text(text = "Outline Button".uppercase())
            }
        }
    }
}