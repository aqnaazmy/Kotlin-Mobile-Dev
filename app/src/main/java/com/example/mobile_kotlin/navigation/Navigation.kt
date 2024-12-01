package com.example.mobile_kotlin.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    Surface (
        modifier = Modifier
            .fillMaxSize(),
        color = Color.Blue
    ){
        val  navController = rememberNavController()
        Scaffold (
            bottomBar = {
                BottomNav(navController)
            }
        ) {
            it

            MyNavHost(
                navHostController = navController,
                startDestination = ScreenName.Home.route
            )
        }
    }
}