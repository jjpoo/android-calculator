package com.nosova.simple.coins.android_project_1.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.nosova.simple.coins.android_project_1.R
import com.nosova.simple.coins.android_project_1.presentation.CalculatorViewModel
import com.nosova.simple.coins.android_project_1.presentation.screens.CalculateScreen
import com.nosova.simple.coins.android_project_1.presentation.screens.MainScreen
import com.nosova.simple.coins.android_project_1.presentation.screens.NavDrawerMenuScreen
import com.nosova.simple.coins.android_project_1.presentation.state.CalculatorUiState
import com.nosova.simple.coins.android_project_1.presentation.theme.Androidproject1Theme
import com.nosova.simple.coins.android_project_1.presentation.utils.CalculatorProjectTopBar
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
    Androidproject1Theme {
        Scaffold(
            topBar = {
                CalculatorProjectTopBar(
                    scope = scope,
                    drawerState = drawerState
                )
            }
        ) {
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                color = colorResource(id = R.color.btn_green)
            ) {
                NavDrawerMenuScreen(
                    drawerState = drawerState,
                    items = uiState.bkItems,
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
                    content = {
                        NavHost(
                            navController = navController,
                            startDestination = Screen.MainScreen.route
                        ) {
                            composable(
                                route = Screen.MainScreen.route,
                                content = {
                                    MainScreen()
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
                                        onEvent = viewModel::handleUiEvent
                                    )
                                }
                            )
                        }
                    }
                )
            }
        }
    }
}