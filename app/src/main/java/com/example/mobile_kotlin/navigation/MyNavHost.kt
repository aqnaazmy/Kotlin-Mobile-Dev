package com.example.mobile_kotlin.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mobile_kotlin.ui.home.HomeScreen
import com.example.mobile_kotlin.ui.shoop.ShoopScreen

@Composable
fun MyNavHost(
    navHostController: NavHostController,
    startDestination: String
) {
    NavHost(
        navController = navHostController,
        startDestination = startDestination,

        builder = {
            composable(NavCons.Home){
                HomeScreen()
            }
            composable(NavCons.Shoop){
                ShoopScreen()
            }
        }
    )
}