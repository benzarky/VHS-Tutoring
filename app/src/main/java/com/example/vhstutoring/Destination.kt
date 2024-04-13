package com.example.vhstutoring

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Destination(
    val path: String,
    val icon: ImageVector? = null,
    val isRootDestination: Boolean = true
) {

    companion object {
        fun fromString(route: String?): Destination {
            return when (route) {
                Home.path -> Home
                Feed.path -> Feed
                Tutors.path -> Tutors
                Students.path -> Students
                Settings.path -> Settings
                Add.path -> Add
                Creation.path -> Creation
                else -> Home
            }
        }
    }

    val title = path.replaceFirstChar {
        it.uppercase()
    }
    object Home : Destination("home")

    object Feed : Destination("tutor", Icons.Default.Person)

    object Tutors : Destination("feed", Icons.Default.List)

    object Students : Destination("students", Icons.Default.Person)

    object Creation : Destination("creation", isRootDestination = false)

    object Settings : Destination("settings", Icons.Default.Settings, isRootDestination = false)

    object Add : Destination("add", Icons.Default.Add, isRootDestination = false)
}
