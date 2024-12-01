package com.example.mobile_kotlin.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

object NavCons{
    const val Home = "Home"
    const val Shoop = "Shoop"
}

sealed class ScreenName(
    val route: String,
    val imageVactor : ImageVector,
    val label : String
){
    object Home : ScreenName(
        route = NavCons.Home,
        imageVactor = Icons.Default.Home,
        label = "Home"
    )
    object Shoop : ScreenName(
        route = NavCons.Shoop,
        imageVactor = Icons.Default.ShoppingCart,
        label = "Shoop"
    )
}