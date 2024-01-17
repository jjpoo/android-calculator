package com.nosova.simple.coins.android_project_1.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
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
import com.nosova.simple.coins.android_project_1.BkItem
import com.nosova.simple.coins.android_project_1.R
import com.nosova.simple.coins.android_project_1.utils.text.DropDownItemText
import com.nosova.simple.coins.android_project_1.utils.text.HeaderText

@Composable
fun DropDownMenuBox(
    bkItem: BkItem
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
                verticalAlignment = Alignment.CenterVertically
            ) {
                HeaderText(
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .weight(1f)
                        .clickable(onClick = { expanded = true }),
                    text = bkItem.headerName
                )
                DropDownImageButton(
                    expanded = expanded,
                    onClick = {
                        expanded = !expanded
                    }
                )
            }
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier.background(colorResource(id = R.color.light_green))
            ) {
                bkItem.items.forEachIndexed { index, s ->
                    DropdownMenuItem(
                        text = {
                            DropDownItemText(text = s)
                        },
                        onClick = {
                            selectedItem = index
                            expanded = false
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
        bkItem = BkItem(
            1,
            "Name",
            items = listOf()
        )
    )
}