package com.nosova.simple.coins.android_project_1.presentation.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nosova.simple.coins.android_project_1.R
import com.nosova.simple.coins.android_project_1.db.BkType
import com.nosova.simple.coins.android_project_1.presentation.utils.DropDownMenuBox
import com.nosova.simple.coins.android_project_1.presentation.utils.text.NavDrawerMenuHeaderText

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavDrawerMenuScreen(
    drawerState: DrawerState,
    items: List<BkType>,
    content: @Composable () -> Unit = {},
    onItemClicked: (String) -> Unit
) {

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp),
            ) {
                ModalDrawerSheet {
                    DrawerHeader()
                    Divider(thickness = 6.dp)
                    DropDownItems(
                        bkItems = items,
                        onItemClicked = onItemClicked
                    )
                }
            }
        },
        content = content
    )
}

@Composable
fun DropDownItems(
    bkItems: List<BkType>,
    onItemClicked: (String) -> Unit
) {
    LazyColumn {
        items(bkItems) { item ->
            DropDownMenuBox(
                item,
                onItemClicked
            )
        }
    }
}

@Composable
fun DrawerHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(96.dp)
            .background(color = colorResource(id = R.color.white_green)),
        contentAlignment = Alignment.Center
    ) {
        NavDrawerMenuHeaderText()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun DrawerHeaderPreview() {
    NavDrawerMenuScreen(
        drawerState = DrawerState(initialValue = DrawerValue.Open),
        items = listOf(),
        onItemClicked = {}
    )
}
