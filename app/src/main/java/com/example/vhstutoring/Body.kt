package com.example.vhstutoring

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun Body(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    destination: Destination,
    onNavigate: (destination: Destination) -> Unit,
    onCreateItem: () -> Unit
) {
    Row(modifier = modifier) {
        Navigation(
            modifier = Modifier.fillMaxSize(),
            navController = navController
        )
    }
}