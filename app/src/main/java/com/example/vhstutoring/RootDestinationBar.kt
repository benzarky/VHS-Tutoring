package com.example.vhstutoring

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.ui.res.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RootDestinationBar(
    modifier: Modifier = Modifier,
    openDrawer: () -> Unit
) {
    TopAppBar(
        modifier = modifier,
        title = {
            Text(text = "Tutoring")
        },
        navigationIcon = {
            IconButton(
                onClick = {
                    openDrawer()
                }
            ) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = null
                )
            }
        }
    )
}
