package com.nosova.simple.coins.android_project_1.presentation.utils

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
import com.nosova.simple.coins.android_project_1.db.CarModel

fun LazyListScope.itemsCountTable(
    carTypes: List<CarModel>,
    numberOfCargoSpace: List<Double>
) {
    val carNameColumn = 0.6f
    val numberOfCargoSpaces = 0.7f

    val tableData = carTypes.zip(numberOfCargoSpace).toMap()

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

    item {
        tableData.forEach { (carType, cargoSpaceCount) ->
            Row(Modifier.fillMaxWidth()) {
                TableCell(text = carType.model, weight = carNameColumn)
                TableCell(text = cargoSpaceCount.toString(), weight = numberOfCargoSpaces)
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



