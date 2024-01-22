package com.nosova.simple.coins.android_project_1.db


val pmgNumberOfVehicleSpace = listOf(28, 32, 28, 64, 50, 50, 60, 20, 26)

data class BkType(
    val name: String,
    val childrenItems: List<BkItem>
)

data class BkItem(
    val bkItemName: String,
    val numberOfGoods: Int,
    val itemsCardSpace: List<Int>
)

//data class ProtigazyF(
//    val name: String,
//    val pmg: ProtigazyFItem = ProtigazyFItem(
//        name = "ПМГ",
//        pmg = carModels.zip(pmgNumberOfVehicleSpace).toMap(),
//        numberOfGoods = 30
//    ),
//    val pmg2: ProtigazyFItem = ProtigazyFItem(
//        name = "ПМГ-2",
//        pmg = carModels.zip(pmgNumberOfVehicleSpace).toMap(),
//        numberOfGoods = 35
//    ),
//    val rsh4Prv: ProtigazyFItem = ProtigazyFItem(
//        name = "РШ-4,ПРВ",
//        pmg = carModels.zip(pmgNumberOfVehicleSpace).toMap(),
//        numberOfGoods = 20
//    )
//)

//data class ProtigazyFItem(
//    val name: String,
//    val pmg: Map<CarModel, Int>,
//    val numberOfGoods: Int
//)
