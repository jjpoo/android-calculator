package com.nosova.simple.coins.android_project_1.presentation.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.nosova.simple.coins.android_project_1.R

@Composable
fun DropDownImageButton(
    expanded: Boolean,
    onClick: () -> Unit
) {
    IconButton(
        onClick = onClick,
    ) {
        Image(
            imageVector = if (expanded) {
                ImageVector.vectorResource(R.drawable.baseline_arrow_drop_up_24)
            } else {
                ImageVector.vectorResource(R.drawable.baseline_arrow_drop_down_24)
            },
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .padding(top = 3.dp)
        )
    }
}