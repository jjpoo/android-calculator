package com.nosova.simple.coins.android_project_1.presentation
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.nosova.simple.coins.android_project_1.db.bkItems
import com.nosova.simple.coins.android_project_1.presentation.state.CalculatorUiEvent
import com.nosova.simple.coins.android_project_1.presentation.state.CalculatorUiState
import java.math.BigDecimal
import java.math.RoundingMode

class CalculatorViewModel : ViewModel() {

    var state by mutableStateOf(CalculatorUiState())
        private set

    init {
        state = state.copy(
            bkItems = bkItems
        )
    }

    fun handleUiEvent(uiEvent: CalculatorUiEvent) {
        when (uiEvent) {

            is CalculatorUiEvent.OnItemCountChanged -> {
                updateItemCount(uiEvent.itemCount)
            }

            is CalculatorUiEvent.OnCalculateClicked -> {
                calculateCarSpaces(
                    itemCount = uiEvent.itemCount,
                    name = uiEvent.name
                )
            }
        }
    }

    private fun calculateCarSpaces(
        itemCount: Double,
        name: String
    ) {
        calculateBoxNumber(itemCount = itemCount, name = name)

        val boxNumberInDouble = requireNotNull(state.numberOfBoxes.toDouble())
        val list = mutableListOf<Double>()

        state.bkItems.forEach { bkType ->
            bkType.childrenItems.forEach { bkItem ->
                if (name == bkItem.bkItemName) {
                    bkItem.itemsCardSpace.forEach {
                        val res = (boxNumberInDouble / it).toTwoDecimalPlaces()
                        list.add(res)
                    }
                }
            }
        }
        state = state.copy(
            numberOfCargoSpace = list
        )
    }

    private fun calculateBoxNumber(
        itemCount: Double,
        name: String
    ) {
        state.bkItems.forEach { bkType ->
            bkType.childrenItems.forEach {
                if (name == it.bkItemName) {
                    val numberOfBoxes =
                        (itemCount / it.numberOfGoods).toTwoDecimalPlaces().toString()

                    updateBoxesNumber(boxesNumber = numberOfBoxes)
                }
            }
        }
    }

    private fun Double.toTwoDecimalPlaces(): Double {
        return BigDecimal(this).setScale(2, RoundingMode.HALF_UP).toDouble()
    }

    private fun updateItemCount(itemCount: String) {
        state = state.copy(
            itemsCount = itemCount
        )
    }
    private fun updateBoxesNumber(boxesNumber: String) {
        state = state.copy(
            numberOfBoxes = boxesNumber
        )
    }
}