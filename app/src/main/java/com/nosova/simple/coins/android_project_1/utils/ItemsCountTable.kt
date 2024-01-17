package com.nosova.simple.coins.android_project_1.utils

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nosova.simple.coins.android_project_1.R

@Composable
fun ItemsCountTable(
    tableData: List<String>
) {
    val carNameColumn = .1f
    val numberOfCargoSpaces = .3f

    tableData.mapIndexed { index, s ->
        index to "Items $index"
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        item {
            Row {
                TableCell(
                    text = stringResource(id = R.string.type_title),
                    weight = carNameColumn
                )
                TableCell(
                    text = stringResource(id = R.string.count_of_cargo_space),
                    weight = numberOfCargoSpaces
                )
            }
        }

        items(tableData) {
            Row(Modifier.fillMaxWidth()) {

                TableCell(text = it, weight = carNameColumn)
                TableCell(text = it, weight = numberOfCargoSpaces)
            }
        }
    }
}

@Composable
fun RowScope.TableCell(
    text: String,
    weight: Float
) {
    Text(
        text = text,
        Modifier
            .border(1.dp, Color.Black)
            .weight(weight)
            .padding(8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun ItemsCountTablePreview(

) {
    ItemsCountTable(
        tableData = listOf("sddasd", "ssdsds", "sdfsdf")
    )
}


