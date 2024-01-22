package com.nosova.simple.coins.android_project_1.presentation.utils.text

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nosova.simple.coins.android_project_1.R

@Composable
fun HeaderText(
    modifier: Modifier,
    text: String
) {
    Text(
        text = text,
        modifier = modifier,
        fontStyle = FontStyle(0),
        color = Color.White,
        fontSize = 25.sp,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun DropDownItemText(text: String) {
    Text(
        text = text,
        modifier = Modifier.fillMaxWidth(),
        color = Color.White,
        fontSize = 20.sp
    )
}

@Composable
fun NavDrawerMenuHeaderText() {
    Text(
        text = stringResource(id = R.string.select_type_bk),
        style = TextStyle.Default,
        fontWeight = FontWeight.Bold,
        color = Color.Black,
        fontSize = 45.sp
    )
}


@Composable
fun CalculateBtnText() {
    Text(
        text = stringResource(id = R.string.calculate_btn),
        color = Color.White,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        modifier = Modifier.padding(
            horizontal = 40.dp,
            vertical = 13.dp
        )
    )
}

@Composable
fun CountTitleText() {
    Text(
        text = stringResource(id = R.string.items_count_title),
        fontSize = 20.sp
    )
}

@Composable
fun ItemNameText(
    itemName: String
) {
    Text(
        text = itemName,
        modifier = Modifier
            .background(colorResource(id = R.color.white_green))
            .padding(30.dp),
        fontWeight = FontWeight.Bold,
        fontSize = 35.sp,
        textAlign = TextAlign.Center,
        maxLines = 5,
        style = LocalTextStyle.current.copy(lineHeight = 40.sp)
    )
}

@Composable
fun BucketsTitleText(
    title: String
) {
    Text(
        text = title,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(
            horizontal = 16.dp,
            vertical = 10.dp
        )
    )
}
