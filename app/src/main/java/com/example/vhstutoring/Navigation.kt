package com.example.vhstutoring

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation

@Composable
fun Navigation(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = Destination.Feed.path
    ) {
        navigation(
            startDestination = Destination.Feed.path,
            route = Destination.Home.path
        ) {
            composable(Destination.Feed.path) {
                ContentArea(
                    modifier = Modifier.fillMaxSize(),
                    destination = Destination.Feed
                )
            }

            composable(Destination.Tutors.path) {
                ContentArea(
                    modifier = Modifier.fillMaxSize(),
                    destination = Destination.Tutors
                )
            }

            composable(Destination.Students.path) {
                ContentArea(
                    modifier = Modifier.fillMaxSize(),
                    destination = Destination.Students
                )
            }
        }

        navigation(
            startDestination = Destination.Add.path,
            route = Destination.Creation.path
        ) {
            composable(Destination.Add.path) {
                ContentArea(
                    modifier = Modifier.fillMaxSize(),
                    destination = Destination.Add
                )
            }

            composable(Destination.Settings.path) {
                ContentArea(
                    modifier = Modifier.fillMaxSize(),
                    destination = Destination.Settings
                )
            }
        }
    }
}