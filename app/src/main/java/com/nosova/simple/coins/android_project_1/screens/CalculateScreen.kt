package com.nosova.simple.coins.android_project_1.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nosova.simple.coins.android_project_1.R
import com.nosova.simple.coins.android_project_1.utils.ItemsCountTable
import com.nosova.simple.coins.android_project_1.utils.text.BucketsTitleText
import com.nosova.simple.coins.android_project_1.utils.text.CalculateBtnText
import com.nosova.simple.coins.android_project_1.utils.text.CountTitleText
import com.nosova.simple.coins.android_project_1.utils.text.ItemNameText

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalculateScreen(
    name: String,
    bucketsCount: Double
) {
    var text by remember { mutableStateOf("Hello") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.light_green)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier.padding(
                horizontal = 50.dp,
                vertical = 30.dp
            )
        ) {
            ItemNameText(itemName = name)
        }
        CountTitleText()
        TextField(
            value = text,
            onValueChange = {},
            modifier = Modifier.padding(top = 20.dp)
        )
        ElevatedButton(
            onClick = {},
            modifier = Modifier.padding(top = 20.dp),
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.btn_green))
        ) {
            CalculateBtnText()
        }
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
            BucketsTitleText(title = bucketsCount.toString())
        }
        ItemsCountTable(
            listOf("ГАЗ-66","ЗИЛ-130-76","ЗИЛ-131")
        )
    }
}


@Preview(showBackground = true)
@Composable
fun CalculateScreenPreview() {
    CalculateScreen(
        name = "Протигази фільтруючі",
        bucketsCount = 12.2
    )
}