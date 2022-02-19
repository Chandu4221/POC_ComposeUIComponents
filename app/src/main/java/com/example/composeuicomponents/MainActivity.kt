package com.example.composeuicomponents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeuicomponents.ui.components.buttons.ButtonDefault
import com.example.composeuicomponents.ui.components.buttons.ButtonOutline
import com.example.composeuicomponents.ui.theme.ComposeUIComponentsTheme
import com.example.composeuicomponents.ui.theme.padding.padding

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeUIComponentsTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
//                    Buttons()
                }
            }
        }

    }
//
//    @Composable
//    private fun Buttons() {
//        Column(modifier = Modifier.padding(ONE.dp)) {
//            Spacer(modifier = Modifier.height(5.dp))
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//                ButtonXS(
//                    onClick = { /*TODO*/ },
//                ) {
//                    Text(
//                        text = "Extra Small",
//                        fontSize = FONT_DIMEN_XS,
//                        lineHeight = LINE_HEIGHT_XS,
//                        fontWeight = FontWeight.Medium
//                    )
//                }
//
//                ButtonXS(
//                    onClick = { /*TODO*/ },
//                ) {
//                    Text(
//                        text = "Extra Small",
//                        style = MaterialTheme.typography.button
//                    )
//                }
//            }
//            Spacer(modifier = Modifier.height(5.dp))
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//                ButtonSM(onClick = { /*TODO*/ }) {
//                    Text(
//                        text = "Small",
//                        fontSize = FONT_DIMEN_SM,
//                        lineHeight = LINE_HEIGHT_SM,
//                        fontWeight = FontWeight.Medium
//                    )
//                }
//                ButtonSM(onClick = { /*TODO*/ }) {
//                    Text(
//                        text = "Small",
//                        style = MaterialTheme.typography.button
//                    )
//                }
//            }
//            Spacer(modifier = Modifier.height(5.dp))
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//                ButtonDefault(onClick = { /*TODO*/ }) {
//                    Text(
//                        text = "Base",
//                        fontSize = FONT_DIMEN_SM,
//                        lineHeight = LINE_HEIGHT_SM,
//                        fontWeight = FontWeight.Medium,
//                    )
//                }
//                ButtonDefault(onClick = { /*TODO*/ }) {
//                    Text(
//                        text = "Base",
//                        style = MaterialTheme.typography.button
//                    )
//                }
//            }
//            Spacer(modifier = Modifier.height(5.dp))
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//                ButtonDefault(onClick = { /*TODO*/ }) {
//                    Text(
//                        text = "Base 2",
//                        fontSize = FONT_DIMEN_SM,
//                        lineHeight = LINE_HEIGHT_SM,
//                        fontWeight = FontWeight.Medium,
//                    )
//                }
//                ButtonDefault(onClick = { /*TODO*/ }) {
//                    Text(
//                        text = "Base 2",
//                        style = MaterialTheme.typography.button
//                    )
//                }
//            }
//
//            Spacer(modifier = Modifier.height(5.dp))
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//                ButtonLG(onClick = { /*TODO*/ }) {
//                    Text(
//                        text = "Large",
//                        fontSize = FONT_DIMEN_BASE,
//                        lineHeight = LINE_HEIGHT_BASE,
//                        fontWeight = FontWeight.Medium
//                    )
//                }
//                ButtonLG(onClick = { /*TODO*/ }) {
//                    Text(
//                        text = "Large",
//                        style = MaterialTheme.typography.button
//                    )
//                }
//            }
//            Spacer(modifier = Modifier.height(5.dp))
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//                ButtonXL(onClick = { /*TODO*/ }) {
//                    Text(
//                        text = "Extra Large",
//                        fontSize = FONT_DIMEN_BASE,
//                        lineHeight = LINE_HEIGHT_BASE,
//                        fontWeight = FontWeight.Medium
//                    )
//                }
//                ButtonXL(onClick = { /*TODO*/ }) {
//                    Text(
//                        text = "Extra Large",
//                        style = MaterialTheme.typography.button
//                    )
//                }
//            }
//
//            Spacer(modifier = Modifier.height(5.dp))
//            ButtonDefault(
//                onClick = { /*TODO*/ },
//                shape = RoundedCornerShape(BORDER_RADIUS_LG),
//                contentPadding = PaddingValues(
//                    start = DIMEN_FOUR.dp,
//                    top = DIMEN_TWO_POINT_FIVE.dp,
//                    bottom = DIMEN_TWO_POINT_FIVE.dp,
//                    end = DIMEN_FIVE.dp
//                )
//            ) {
//                Icon(
//                    imageVector = Icons.Filled.ShoppingCart,
//                    contentDescription = "Shopping Cart",
//                    modifier = Modifier
//                        .height(DIMEN_FIVE.dp)
//                        .width(DIMEN_FIVE.dp)
//                )
//                Text(
//                    text = "Buy now",
//                    fontSize = FONT_DIMEN_SM,
//                    lineHeight = LINE_HEIGHT_SM,
//                    fontWeight = FontWeight.Medium,
//                    modifier = Modifier.padding(start = DIMEN_TWO.dp)
//                )
//            }
//            Spacer(modifier = Modifier.height(5.dp))
//            ButtonDefault(
//                onClick = { /*TODO*/ },
//                shape = RoundedCornerShape(BORDER_RADIUS_LG),
//                contentPadding = PaddingValues(
//                    start = DIMEN_FIVE.dp,
//                    top = DIMEN_TWO_POINT_FIVE.dp,
//                    bottom = DIMEN_TWO_POINT_FIVE.dp,
//                    end = DIMEN_FOUR.dp
//                )
//            ) {
//                Text(
//                    text = "Choose Plan",
//                    fontSize = FONT_DIMEN_SM,
//                    lineHeight = LINE_HEIGHT_SM,
//                    fontWeight = FontWeight.Medium,
//                    modifier = Modifier.padding(end = DIMEN_TWO.dp)
//                )
//                Icon(
//                    imageVector = Icons.Filled.ArrowForward,
//                    contentDescription = "Shopping Cart",
//                    modifier = Modifier
//                        .height(DIMEN_FIVE.dp)
//                        .width(DIMEN_FIVE.dp)
//                )
//            }
//            Spacer(modifier = Modifier.height(5.dp))
//            ButtonOutline(onClick = { /*TODO*/ }) {
//                Text(
//                    text = "Outline",
//                    fontSize = FONT_DIMEN_SM,
//                    lineHeight = LINE_HEIGHT_SM,
//                    fontWeight = FontWeight.Medium
//                )
//            }
//            Spacer(modifier = Modifier.height(5.dp))
//            Button(onClick = {}) {
//                Text(text = "Hello Button")
//            }
//        }
//    }

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
            ButtonDefault(onClick = { /*TODO*/ }, modifier = MaterialTheme.padding.p0) {
                Text(text = "Default Button".uppercase())
            }
            ButtonOutline(onClick = { /*TODO*/ }) {
                Text(text = "Outline Button".uppercase())
            }
        }
    }
}