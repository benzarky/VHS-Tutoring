package com.example.vhstutoring

import android.icu.number.NumberFormatter.UnitWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChildDestinationBar(
    modifier: Modifier = Modifier,
    onNavigateUp: () -> Unit
) {
    TopAppBar(
        modifier = Modifier,
        title = {
            Text(text = "Settings")
        },
        navigationIcon = {
            IconButton(
                onClick = {
                    onNavigateUp()
                }
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = null
                )
            }
        }
    )
}