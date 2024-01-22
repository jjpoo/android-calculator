package com.nosova.simple.coins.android_project_1.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nosova.simple.coins.android_project_1.R
import com.nosova.simple.coins.android_project_1.db.BkType
import com.nosova.simple.coins.android_project_1.db.bkItems
import com.nosova.simple.coins.android_project_1.db.carModels
import com.nosova.simple.coins.android_project_1.presentation.state.CalculatorUiEvent
import com.nosova.simple.coins.android_project_1.presentation.state.CalculatorUiState
import com.nosova.simple.coins.android_project_1.presentation.utils.CalculatorProjectTopBar
import com.nosova.simple.coins.android_project_1.presentation.utils.itemsCountTable
import com.nosova.simple.coins.android_project_1.presentation.utils.text.BucketsTitleText
import com.nosova.simple.coins.android_project_1.presentation.utils.text.CalculateBtnText
import com.nosova.simple.coins.android_project_1.presentation.utils.text.CountTitleText
import com.nosova.simple.coins.android_project_1.presentation.utils.text.ItemNameText
import kotlinx.coroutines.CoroutineScope

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalculateScreen(
    name: String,
    state: CalculatorUiState,
    scope: CoroutineScope,
    drawerState: DrawerState,
    onEvent: (CalculatorUiEvent) -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.light_green)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Box(
                modifier = Modifier.padding(
                    horizontal = 50.dp,
                    vertical = 30.dp
                )
            ) {
                ItemNameText(itemName = name)
            }
        }
        item {
            CountTitleText()
        }
        item {
            TextField(
                value = state.itemsCount,
                onValueChange = {
                    onEvent(CalculatorUiEvent.OnItemCountChanged(it))
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
                modifier = Modifier.padding(top = 20.dp)
            )
        }
        item {
            ElevatedButton(
                onClick = {
                    onEvent(
                        CalculatorUiEvent.OnCalculateClicked(
                            itemCount = requireNotNull(state.itemsCount.toDouble()),
                            name = name
                        )
                    )
                },
                modifier = Modifier.padding(top = 20.dp),
                colors = ButtonDefaults.buttonColors(colorResource(id = R.color.btn_green))
            ) {
                CalculateBtnText()
            }
        }
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = 50.dp,
                        vertical = 20.dp
                    )
                    .background(colorResource(id = R.color.white_green)),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                BucketsTitleText(title = stringResource(id = R.string.buckets_title))
                BucketsTitleText(
                    title = state.numberOfBoxes
                )
            }
        }
        itemsCountTable(
            carTypes = carModels,
            numberOfCargoSpace = state.numberOfCargoSpace
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun CalculateScreenPreview() {
    CalculateScreen(
        name = "Протигази фільтруючі",
        state = CalculatorUiState(),
        scope = rememberCoroutineScope(),
        drawerState = DrawerState(initialValue = DrawerValue.Closed),
        onEvent = {}
    )
}