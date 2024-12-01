package com.example.mobile_kotlin.navigation

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun BottomNav(
    navHostController: NavHostController
) {
    var selectedIndex by remember {
        mutableIntStateOf(0)
    }

    val list = listOf(
        ScreenName.Home,
        ScreenName.Shoop
    )
    NavigationBar(
        modifier = Modifier
            .clip(RoundedCornerShape(
                topStart = 10.dp,
                topEnd = 10.dp))
    ) {
        list.forEachIndexed { index, screenName ->
            NavigationBarItem(
                selected = selectedIndex == index,
                onClick = {
                    navHostController.navigate(screenName.route)
                    selectedIndex = index
                },
                icon = {
                    Icon(
                        imageVector = screenName.imageVactor,
                        contentDescription = null)
                },
                label = {
                    Text(text = screenName.label)
                },
                alwaysShowLabel = false
            )
        }
    }
}