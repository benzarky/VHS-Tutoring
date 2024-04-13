package com.example.vhstutoring

import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ColumnScope.DrawerContent(
    onNavigate: (destination: Destination) -> Unit,
    onLogout: () -> Unit
) {
    Text(
        modifier = Modifier.padding(16.dp),
        text = "Tutoring",
        fontSize = 20.sp
    )
    Divider(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    )
    DrawerItem(
        modifier = Modifier.fillMaxWidth(),
        label = "Settings",
        onClick = {
            onNavigate(Destination.Settings)
        }
    )
    Spacer(
        modifier = Modifier.weight(1f)
    )
    DrawerItem(
        modifier = Modifier.fillMaxWidth(),
        label = "Logout",
        onClick = {
            onLogout()
        }
    )
}

@Composable
fun DrawerItem(
    modifier: Modifier = Modifier,
    label: String,
    onClick: () -> Unit
) {
    Text(
        modifier = Modifier
            .clickable {
                onClick()
            }
            .padding(16.dp),
        text = label
    )
}