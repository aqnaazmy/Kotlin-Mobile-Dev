package com.example.mobile_kotlin.modifier

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun teks(){
    Text(
        text = "Hello Plugin",
        color = Color.Red,
        fontSize = 32.sp,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Cyan)
            .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun button(){
    Surface (
        modifier = Modifier
            .fillMaxSize()
    ){
        Button(
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.Red
            ),
            onClick = { },
            modifier = Modifier
                .wrapContentSize(Alignment.Center)
                .width(250.dp)
                .height(100.dp)
        ) {
            Text(
                text = "Click",
                fontSize = 50.sp
            )
        }
    }
}

@Preview
@Composable
private fun preview() {
//    teks()
    button()
}

