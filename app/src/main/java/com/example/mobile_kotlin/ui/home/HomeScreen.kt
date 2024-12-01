package com.example.mobile_kotlin.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobile_kotlin.R

@Composable
fun HomeScreen() {
    val scroll = rememberScrollState()
    Surface (
        modifier = Modifier
            .verticalScroll(scroll)
            .padding(bottom = 100.dp)
            .background(Color.White)
    ){
        Column (
            Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .padding(bottom = 40.dp)
        ){
            Box {
                Image(
                    painter = painterResource(id = R.drawable.im_container),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(210.dp)
                )
                Row (
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(start = 36.dp, end = 36.dp, top = 50.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Hello Plugin !!",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .weight(1f)
                            .padding(
                                start = 16.dp,
                            ),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            color = Color.White
                        )
                    )
                    Icon(
                        imageVector = Icons.Outlined.Notifications,
                        contentDescription = null,
                        tint = Color.White
                    )
                }

                Image(
                    painter = painterResource(id = R.drawable.im_benner),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 140.dp, start =36.dp, end = 36.dp )
                        .height(130.dp)
                )
            }
            Text(
                text = "Categories",
                fontWeight = FontWeight.Bold,
                fontSize = 21.sp,
                modifier = Modifier
                    .padding(top = 20.dp, start = 36.dp)
            )

            LazyRow {
                item {
                    Column(
                        modifier = Modifier
                            .padding(top = 20.dp, start = 36.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.im_allproduct),
                            contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .width(70.dp)
                                .height(70.dp)
                        )
                        Text(
                            text = "Semua",
                            fontWeight = FontWeight.Normal,
                            fontSize = 15.sp,
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .padding(top = 8.dp)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(top = 20.dp, start = 36.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.im_allproduct),
                            contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .width(70.dp)
                                .height(70.dp)
                        )
                        Text(
                            text = "Semua",
                            fontWeight = FontWeight.Normal,
                            fontSize = 15.sp,
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .padding(top = 8.dp)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(top = 20.dp, start = 36.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.im_allproduct),
                            contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .width(70.dp)
                                .height(70.dp)
                        )
                        Text(
                            text = "Semua",
                            fontWeight = FontWeight.Normal,
                            fontSize = 15.sp,
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .padding(top = 8.dp)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(top = 20.dp, start = 36.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.im_allproduct),
                            contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .width(70.dp)
                                .height(70.dp)
                        )
                        Text(
                            text = "Semua",
                            fontWeight = FontWeight.Normal,
                            fontSize = 15.sp,
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .padding(top = 8.dp)
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun HomeScreenPrev() {
    HomeScreen()
}