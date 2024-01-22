package com.nosova.simple.coins.android_project_1.navigation

import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.nosova.simple.coins.android_project_1.db.bkItems
import com.nosova.simple.coins.android_project_1.presentation.CalculatorViewModel
import com.nosova.simple.coins.android_project_1.presentation.screens.CalculateScreen
import com.nosova.simple.coins.android_project_1.presentation.screens.MainScreen
import com.nosova.simple.coins.android_project_1.presentation.state.CalculatorUiState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationGraph(
    navController: NavHostController,
    viewModel: CalculatorViewModel,
    drawerState: DrawerState,
    uiState: CalculatorUiState,
    scope: CoroutineScope
) {
    NavHost(
        navController = navController,
        startDestination = Screen.MainScreen.route
    ) {
        composable(
            route = Screen.MainScreen.route,
            content = {
                MainScreen(
                    drawerState = drawerState,
                    scope = scope,
                    items = bkItems,
                    onItemClicked = { name ->
                        navController.navigate(
                            route = Screen.CalculatorScreen.getScreenWithArguments(
                                name = name
                            )
                        )
                        scope.launch {
                            drawerState.close()
                        }
                    }
                )
            }
        )
        composable(
            route = Screen.CalculatorScreen.route,
            content = { entry ->
                val nameArg = entry.arguments?.getString("name")
                CalculateScreen(
                    name = nameArg.orEmpty(),
                    state = uiState,
                    scope = scope,
                    drawerState = drawerState,
                    items = bkItems,
                    onItemClicked = { name ->
                        navController.navigate(
                            route = Screen.CalculatorScreen.getScreenWithArguments(
                                name = name
                            )
                        )
                        scope.launch {
                            drawerState.close()
                        }
                    },
                    onEvent = viewModel::handleUiEvent
                )
            }
        )
    }
}
