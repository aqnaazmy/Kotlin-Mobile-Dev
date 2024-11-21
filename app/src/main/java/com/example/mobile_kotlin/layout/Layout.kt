package com.example.mobile_kotlin.layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobile_kotlin.R

@Composable
fun Layout() {
    Card (
        modifier = Modifier
            .width(450.dp)
            .height(100.dp)
            .fillMaxWidth()
            .padding(8.dp)
    ){
        Row (
            modifier = Modifier
                .padding(11.dp)
        ) {
            Box (
                modifier = Modifier
                    .padding(end = 18.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = null,
                    alignment = Alignment.Center,
                    modifier = Modifier
                        .size(65.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_check),
                    contentDescription = null,
                    modifier = Modifier
                        .size(20.dp)
                        .align(alignment = Alignment.BottomEnd)
                )
            }
            Column(
                modifier = Modifier
                    .padding(vertical = 6.dp)
            ) {
                Text(
                    text = "Plugin",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Kotlin mobile development",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Light
                )
            }
        }
    }
}

@Preview
@Composable
private fun LayoutPreview() {
    Layout()
}