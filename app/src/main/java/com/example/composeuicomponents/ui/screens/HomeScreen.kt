package com.example.composeuicomponents.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.ShoppingBag
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.composeuicomponents.R
import com.example.composeuicomponents.ui.theme.dimensions.EIGHT
import com.example.composeuicomponents.ui.theme.dimensions.EIGHTY
import com.example.composeuicomponents.ui.theme.dimensions.ELEVEN
import com.example.composeuicomponents.ui.theme.dimensions.FIVE
import com.example.composeuicomponents.ui.theme.dimensions.FOUR
import com.example.composeuicomponents.ui.theme.dimensions.SIX
import com.example.composeuicomponents.ui.theme.dimensions.TWENTY
import com.example.composeuicomponents.ui.theme.dimensions.TWO
import com.example.composeuicomponents.ui.theme.dimensions.ZERO

@OptIn(ExperimentalUnitApi::class)
@Preview
@Composable
fun HomeScreen() {
    Scaffold(
        backgroundColor = Color(0xffEE5355),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        color = Color.White,
                        text = "PizzaDoro",
                        fontSize = FIVE.sp,
                        style = MaterialTheme.typography.h4.copy(
                            shadow = Shadow(
                                color = Color(0xFF2B3252),
                                offset = Offset(4f, 4f),
                                blurRadius = 1f
                            )
                        ),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.Menu, "backIcon")
                    }
                },
                backgroundColor = Color.Transparent,
                contentColor = Color(0xFF2B3252),
                elevation = ZERO.dp,
                actions = {
                    IconButton(
                        onClick = { /*TODO*/ },
                        enabled = true
                    ) {
                        Icon(
                            Icons.Outlined.ShoppingBag,
                            contentDescription = "Shopping Bag"
                        )
                    }
                }
            )
        }
    ) {
//main content
        MainContent()
    }
}

@Composable
fun MainContent() {
    Column(modifier = Modifier.fillMaxWidth(1f)) {
        //User name
        Text(
            text = "Good Evening,Joanne!",
            color = Color.White,
            style = MaterialTheme.typography.h6.copy(),
            modifier = Modifier.padding(FIVE.dp)
        )
        // lets begin 
        ConstraintLayout(modifier = Modifier.fillMaxWidth()) {
            val (image, yellowBox) = createRefs()
            Card(
                backgroundColor = Color(0xffFDE30E),
                modifier = Modifier
                    .padding(TWO.dp)
                    .fillMaxWidth(1f)
                    .constrainAs(yellowBox) {
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                        start.linkTo(parent.start, margin = -FIVE.dp)
                    },
                shape = RoundedCornerShape(
                    bottomEnd = EIGHTY.dp,
                    topEnd = EIGHTY.dp
                )
            ) {
                Column(
                    modifier = Modifier.padding(
                        start = EIGHT.dp,
                        top = FIVE.dp,
                        bottom = FIVE.dp,
                        end = TWENTY.dp
                    )
                ) {
                    Text(
                        text = "Classic is the Answer",
                        style = MaterialTheme.typography.h6,
                        color = Color(0xff2B3252)
                    )
                    Text(
                        text = "You can find all traditional pies what made you fall in love with pizza.",
                        style = MaterialTheme.typography.subtitle2,
                        color = Color(0xff2B3252),
                        modifier = Modifier.fillMaxWidth(0.8f)
                    )
                    Spacer(modifier = Modifier.height(TWO.dp))
                    Button(
                        modifier = Modifier.padding(start = SIX.dp),
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color(0xff2B3252)
                        ),
                        shape = RoundedCornerShape(CornerSize(TWENTY.dp))
                    ) {
                        Text(
                            text = "Lets Begin",
                            style = MaterialTheme.typography.button,
                            color = Color(0xffFDE30E),
                            modifier = Modifier.padding(FOUR.dp),
                        )
                    }
                }
            }

            Image(
                painter = painterResource(id = R.drawable.pizza_menu),
                contentDescription = "Pizza Menu",
                modifier = Modifier
                    .height(200.dp)
                    .width(198.dp)
                    .constrainAs(image) {
                        end.linkTo(parent.end, margin = -ELEVEN.dp)
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                    }
            )
        }
    }
}


@Composable
fun ConstraintLayoutDemo() {
    ConstraintLayout(modifier = Modifier.size(200.dp)) {
        val (redBox, blueBox, yellowBox, text) = createRefs()

        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Red)
            .constrainAs(redBox) {})

        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Blue)
            .constrainAs(blueBox) {
                top.linkTo(redBox.bottom)
                start.linkTo(redBox.end)
            })

        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Yellow)
            .constrainAs(yellowBox) {
                bottom.linkTo(blueBox.bottom)
                start.linkTo(blueBox.end, 20.dp)
            })

        Text("Hello World", modifier = Modifier.constrainAs(text) {
            top.linkTo(parent.top)
            start.linkTo(yellowBox.start)
        })

    }
}
