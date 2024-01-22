package com.nosova.simple.coins.android_project_1.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nosova.simple.coins.android_project_1.R

@Composable
fun MainScreen() {
    Surface(
        modifier = Modifier,
        color = colorResource(id = R.color.btn_green)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .background(colorResource(id = R.color.light_green))
        ) {
            Text(
                text = "Натисніть на меню вгорі та виберіть тип БК для якого треба розрахувати місце в машині.",
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 2.dp),
                color = Color.Black
            )
        }
    }
}