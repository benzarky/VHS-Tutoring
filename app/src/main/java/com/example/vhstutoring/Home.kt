package com.example.vhstutoring

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import androidx.compose.runtime.*
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import kotlinx.coroutines.launch


@Composable
fun Home(
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()
    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val currentDestination by remember {
        derivedStateOf {
            Destination.fromString(navBackStackEntry.value?.destination?.route)
        }
    }
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val coroutineScope = rememberCoroutineScope()
    Scaffold (
        modifier = modifier,
        topBar = {
            DestinationTopBar(
                modifier = modifier,
                currentDestination = currentDestination,
                openDrawer = {
                    coroutineScope.launch{
                        drawerState.open()
                    }
                },
                onNavigateUp = {
                    navController.popBackStack()
                }
            )
        },
        bottomBar = {

        },
        floatingActionButton = {

        }
    ) { padding ->
        Body (
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            destination = currentDestination,
            navController = navController,
            onCreateItem = {
                navController.navigate(Destination.Add.path)
            },
            onNavigate = { destination ->
                navController.navigate(destination.path) {
                    popUpTo(navController.graph.findStartDestination().id) {
                        saveState = true
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            }
        )
    }
}
