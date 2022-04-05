package com.example.composeuicomponents.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.material.icons.outlined.TrendingFlat
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
import com.example.composeuicomponents.ui.theme.dimensions.FOURTEEN
import com.example.composeuicomponents.ui.theme.dimensions.SIX
import com.example.composeuicomponents.ui.theme.dimensions.THREE
import com.example.composeuicomponents.ui.theme.dimensions.TWENTY
import com.example.composeuicomponents.ui.theme.dimensions.TWENTY_EIGHT
import com.example.composeuicomponents.ui.theme.dimensions.TWENTY_FOUR
import com.example.composeuicomponents.ui.theme.dimensions.TWO
import com.example.composeuicomponents.ui.theme.dimensions.ZERO
import com.example.composeuicomponents.ui.theme.dimensions.ZERO_POINT_FIVE

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

@OptIn(ExperimentalUnitApi::class)
@Composable
fun MainContent() {
    Column() {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .weight(1f, false)
                .padding(bottom = FIVE.dp)

        ) {
            //User name
            Text(
                text = "Good Evening,Joanne!",
                color = Color.White,
                style = MaterialTheme.typography.h5.copy(),
                modifier = Modifier.padding(
                    horizontal = FIVE.dp,
                    vertical = ZERO_POINT_FIVE.dp
                )
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
                            end = TWENTY_FOUR.dp
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
                                modifier = Modifier.padding(
                                    horizontal = THREE.dp,
                                    vertical = TWO.dp
                                ),
                            )
                        }
                    }
                }

                Image(
                    painter = painterResource(id = R.drawable.pizza_menu),
                    contentDescription = "Pizza Menu",
                    modifier = Modifier
                        .height(216.dp)
                        .width(198.dp)
                        .constrainAs(image) {
                            end.linkTo(parent.end, margin = -ELEVEN.dp)
                            top.linkTo(parent.top)
                            bottom.linkTo(parent.bottom)
                        }
                )
            }

            // categories
            Text(
                text = "Categories",
                color = Color.White,
                style = MaterialTheme.typography.h5.copy(),
                modifier = Modifier.padding(
                    horizontal = FIVE.dp,
                    vertical = ZERO_POINT_FIVE.dp
                )
            )

            ConstraintLayout(modifier = Modifier.fillMaxWidth()) {
                val (image, yellowBox) = createRefs()
                Card(
                    backgroundColor = Color(0xffFDE30E),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = FOURTEEN.dp)
                        .constrainAs(yellowBox) {
                            top.linkTo(parent.top)
                            bottom.linkTo(parent.bottom)
                            end.linkTo(parent.end)
                        },
                    shape = RoundedCornerShape(
                        topStart = EIGHTY.dp,
                        bottomStart = EIGHTY.dp
                    )
                ) {
                    Column(
                        horizontalAlignment = Alignment.End,
                        modifier = Modifier
                            .padding(
                                top = TWO.dp,
                                bottom = TWO.dp
                            )
                    ) {
                        Text(
                            text = "Deep Dish Pizza",
                            style = MaterialTheme.typography.h6,
                            color = Color(0xff2B3252),
                            modifier = Modifier.padding(horizontal = FIVE.dp)
                        )
                        Spacer(modifier = Modifier.height(TWO.dp))
                        Row(
                            horizontalArrangement = Arrangement.End,
                            modifier = Modifier.fillMaxWidth(0.7f)
                        ) {
                            Text(
                                "$15.99",
                                color = Color(0xffEE5355),
                                style = MaterialTheme.typography.h6,
                                modifier = Modifier.padding(horizontal = FIVE.dp)
                            )
                            Button(
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.buttonColors(
                                    backgroundColor = Color(0xff2B3252)
                                ),
                                shape = RoundedCornerShape(
                                    topStart = TWENTY.dp,
                                    bottomStart = TWENTY.dp
                                )
                            ) {
                                Text(
                                    text = "About",
                                    style = MaterialTheme.typography.subtitle1,
                                    color = Color(0xffFDE30E),
                                    modifier = Modifier.padding(
                                        start = THREE.dp,
                                        end = TWO.dp,
                                        top = ZERO.dp,
                                        bottom = ZERO.dp
                                    ),
                                )
                            }
                        }
                    }
                }
                Image(
                    painter = painterResource(id = R.drawable.pizza_pull),
                    contentDescription = "Pizza Menu",
                    modifier = Modifier
                        .height(130.dp)
                        .width(164.dp)
                        .constrainAs(image) {
                            top.linkTo(parent.top)
                            bottom.linkTo(parent.bottom)
                            start.linkTo(parent.start)
                        }
                )

            }

            // new york style
            ConstraintLayout(modifier = Modifier.fillMaxWidth()) {
                val (image, yellowBox) = createRefs()
                Card(
                    backgroundColor = Color(0xffFDE30E),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = FOURTEEN.dp)
                        .constrainAs(yellowBox) {
                            top.linkTo(parent.top)
                            bottom.linkTo(parent.bottom)
                            start.linkTo(parent.start)
                        },
                    shape = RoundedCornerShape(
                        topEnd = EIGHTY.dp,
                        bottomEnd = EIGHTY.dp
                    )
                ) {
                    Column(
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier.padding(
                            top = TWO.dp,
                            bottom = TWO.dp,
                        )
                    ) {
                        Text(
                            text = "Deep Dish Pizza",
                            style = MaterialTheme.typography.h6,
                            color = Color(0xff2B3252),
                            modifier = Modifier.padding(start = FIVE.dp)
                        )
                        Spacer(modifier = Modifier.height(TWO.dp))
                        Row(
                            horizontalArrangement = Arrangement.Start,
                            modifier = Modifier.fillMaxWidth(0.7f)
                        ) {
                            Button(
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.buttonColors(
                                    backgroundColor = Color(0xff2B3252)
                                ),
                                shape = RoundedCornerShape(
                                    topEnd = TWENTY.dp,
                                    bottomEnd = TWENTY.dp
                                )
                            ) {
                                Text(
                                    text = "About",
                                    style = MaterialTheme.typography.subtitle1,
                                    color = Color(0xffFDE30E),
                                    modifier = Modifier.padding(
                                        start = TWO.dp,
                                        end = THREE.dp,
                                        top = ZERO.dp,
                                        bottom = ZERO.dp
                                    ),
                                )
                            }
                            Text(
                                "$12.99",
                                color = Color(0xffEE5355),
                                style = MaterialTheme.typography.h6,
                                modifier = Modifier.padding(horizontal = FIVE.dp)
                            )
                        }
                    }
                }
                Image(
                    painter = painterResource(id = R.drawable.slider_cheese),
                    contentDescription = "Pizza Menu",
                    modifier = Modifier
                        .height(169.dp)
                        .width(195.dp)
                        .constrainAs(image) {
                            top.linkTo(parent.top)
                            bottom.linkTo(parent.bottom)
                            end.linkTo(parent.end)
                        }
                )

            }

            // 3rd pizza
            ConstraintLayout(modifier = Modifier.fillMaxWidth()) {
                val (image, yellowBox) = createRefs()
                Card(
                    backgroundColor = Color(0xffFDE30E),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = FOURTEEN.dp)
                        .constrainAs(yellowBox) {
                            top.linkTo(parent.top)
                            bottom.linkTo(parent.bottom)
                            end.linkTo(parent.end)
                        },
                    shape = RoundedCornerShape(
                        topStart = EIGHTY.dp,
                        bottomStart = EIGHTY.dp
                    )
                ) {
                    Column(
                        horizontalAlignment = Alignment.End,
                        modifier = Modifier
                            .padding(
                                top = TWO.dp,
                                bottom = TWO.dp
                            )
                    ) {
                        Text(
                            text = "Deep Dish Pizza",
                            style = MaterialTheme.typography.h6,
                            color = Color(0xff2B3252),
                            modifier = Modifier.padding(horizontal = FIVE.dp)
                        )
                        Spacer(modifier = Modifier.height(TWO.dp))
                        Row(
                            horizontalArrangement = Arrangement.End,
                            modifier = Modifier.fillMaxWidth(0.7f)
                        ) {
                            Text(
                                "$15.99",
                                color = Color(0xffEE5355),
                                style = MaterialTheme.typography.h6,
                                modifier = Modifier.padding(horizontal = FIVE.dp)
                            )
                            Button(
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.buttonColors(
                                    backgroundColor = Color(0xff2B3252)
                                ),
                                shape = RoundedCornerShape(
                                    topStart = TWENTY.dp,
                                    bottomStart = TWENTY.dp
                                )
                            ) {
                                Text(
                                    text = "About",
                                    style = MaterialTheme.typography.subtitle1,
                                    color = Color(0xffFDE30E),
                                    modifier = Modifier.padding(
                                        start = THREE.dp,
                                        end = TWO.dp,
                                        top = ZERO.dp,
                                        bottom = ZERO.dp
                                    ),
                                )
                            }
                        }
                    }
                }
                Image(
                    painter = painterResource(id = R.drawable.pizza),
                    contentDescription = "Pizza Menu",
                    modifier = Modifier
                        .height(99.dp)
                        .width(199.dp)
                        .constrainAs(image) {
                            top.linkTo(parent.top)
                            bottom.linkTo(parent.bottom)
                            start.linkTo(parent.start)
                        }
                )

            }

            Spacer(modifier = Modifier.height(FIVE.dp))

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(CornerSize(TWENTY_EIGHT.dp)),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color(0xffFDE30E),
                        contentColor = Color(0xff2B3252)
                    ),
                ) {
                    Row(
                        modifier = Modifier.padding(
                            vertical = ZERO_POINT_FIVE.dp,
                            horizontal = ZERO_POINT_FIVE.dp
                        )
                    ) {
                        Text(
                            text = "Create your own pie",
                            color = Color(0xff2B3252),
                            style = MaterialTheme.typography.button,
                        )
                        Icon(
                            Icons.Outlined.TrendingFlat,
                            contentDescription = "Create Your Pie",
                            modifier = Modifier.padding(start = FIVE.dp)
                        )
                    }
                }
            }
        }
    }
}



