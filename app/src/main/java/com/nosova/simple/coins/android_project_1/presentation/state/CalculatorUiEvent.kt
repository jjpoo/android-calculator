package com.nosova.simple.coins.android_project_1.presentation.state

sealed class CalculatorUiEvent {
    class OnItemCountChanged(val itemCount: String) : CalculatorUiEvent()

    class OnCalculateClicked(
        val itemCount: Double,
        val name: String
    ) : CalculatorUiEvent()
}