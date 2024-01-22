package com.nosova.simple.coins.android_project_1.presentation.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.nosova.simple.coins.android_project_1.R
import com.nosova.simple.coins.android_project_1.db.BkItem
import com.nosova.simple.coins.android_project_1.db.BkType
import com.nosova.simple.coins.android_project_1.presentation.theme.Androidproject1Theme
import com.nosova.simple.coins.android_project_1.presentation.utils.CalculatorProjectTopBar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    drawerState: DrawerState,
    scope: CoroutineScope,
    items: List<BkType>,
    onItemClicked: (String) -> Unit
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
                    items = items,
                    onItemClicked = onItemClicked
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun MainScreenPreview() {
    MainScreen(
        drawerState = rememberDrawerState(initialValue = DrawerValue.Closed),
        scope = rememberCoroutineScope(),
        items = listOf(),
        onItemClicked = {}
    )
}