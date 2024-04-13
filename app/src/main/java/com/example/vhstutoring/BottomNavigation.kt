package com.example.vhstutoring

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun BottomNavigationBar(
    modifier: Modifier = Modifier,
    currentDestination: Destination,
    onNavigate: (destination: Destination) -> Unit
) {
    NavigationBar(
        modifier = modifier
    ) {

    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomNavItem
) {
    NavigationBarItem(
        selected = false,
        label = {
            Text(text = screen.title)
        },
        icon = {
            Icon(
                ImageVector = screen.icon,
                contentDescription = null
            )
        },
        onClick = {

        }
    )
}

sealed class BottomNavItem(
    var title: String,
    var icon: ImageVector
) {
    data object Tutors:
        BottomNavItem(
            "Find Tutors",
            Icons.Default.Person
        )
    data object Feed:
        BottomNavItem(
            "Feed",
            Icons.Default.Menu
        )
    data object Students:
        BottomNavItem(
            "Find Students",
            Icons.Default.Person
        )
}







