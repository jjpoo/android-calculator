package com.nosova.simple.coins.android_project_1.presentation.state

import com.nosova.simple.coins.android_project_1.db.BkType

data class CalculatorUiState(
    val bkItems: List<BkType> = listOf(),
    val itemsCount: String = "0.0",
    val numberOfBoxes: String = "",
    val numberOfCargoSpace: List<Double> = listOf(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
)