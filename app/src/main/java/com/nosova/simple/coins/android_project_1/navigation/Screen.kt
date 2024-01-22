package com.nosova.simple.coins.android_project_1.navigation

sealed class Screen(val route: String) {
    object MainScreen : Screen(route = "main_screen")
    object CalculatorScreen : Screen(
        route = "calculator_screen/{name}"
    ) {
        fun getScreenWithArguments(
            name: String
        ): String {
            return "calculator_screen/$name"
        }
    }
}