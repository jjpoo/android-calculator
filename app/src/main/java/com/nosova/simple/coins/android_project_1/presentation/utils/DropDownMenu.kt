package com.nosova.simple.coins.android_project_1.presentation.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nosova.simple.coins.android_project_1.R
import com.nosova.simple.coins.android_project_1.db.BkType
import com.nosova.simple.coins.android_project_1.presentation.utils.text.DropDownItemText
import com.nosova.simple.coins.android_project_1.presentation.utils.text.HeaderText

@Composable
fun DropDownMenuBox(
    bkItem: BkType,
    onItemClicked: (String) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    var selectedItem by remember { mutableStateOf(0) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.dark_green))
    ) {
        Column {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.clickable {
                    expanded = !expanded
                }
            ) {
                HeaderText(
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .weight(1f)
                        .clickable(onClick = { expanded = true }),
                    text = bkItem.name
                )
                DropDownImageButton(
                    expanded = expanded,
                    onClick = {
                        expanded = false
                    }
                )
            }
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier.background(colorResource(id = R.color.light_green))
            ) {
                bkItem.childrenItems.forEachIndexed { index, bkItem ->
                    DropdownMenuItem(
                        text = {
                            DropDownItemText(text = bkItem.bkItemName)
                        },
                        onClick = {
                            selectedItem = index
                            expanded = false
                            onItemClicked.invoke(bkItem.bkItemName)
                        }
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DropDownMenuBoxPreview() {
    DropDownMenuBox(
        bkItem = BkType(
            "",
            childrenItems = listOf()
        ),
        onItemClicked = {}
    )
}