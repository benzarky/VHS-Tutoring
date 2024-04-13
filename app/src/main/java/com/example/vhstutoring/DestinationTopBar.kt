package com.example.vhstutoring

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun DestinationTopBar(
    modifier: Modifier = Modifier,
    currentDestination: Destination,
    openDrawer: () -> Unit,
    onNavigateUp: () -> Unit
) {
    if (currentDestination.isRootDestination)
    {
        RootDestinationBar(
            modifier = modifier,
            openDrawer = {
                openDrawer()
            }
        )
    } else
    {
        ChildDestinationBar(
            modifier = modifier,
            onNavigateUp = {
                onNavigateUp()
            }
        )
    }
}