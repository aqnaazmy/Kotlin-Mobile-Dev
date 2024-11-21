package com.example.mobile_kotlin.lazyLayout

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.mobile_kotlin.layout.Layout

@Composable
fun LazyLayout() {
    LazyColumn {
        items(20){ index ->
//            Text("cek")
            Layout()
        }
    }
}

@Preview
@Composable
private fun LazyLayoutPreview() {
    LazyLayout()
}