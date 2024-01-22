package com.nosova.simple.coins.android_project_1.db


val bkItems = listOf(
    BkType(
        name = "Протигази фільтруючі",
        childrenItems = listOf(
            BkItem(
                bkItemName = "ПМГ",
                itemsCardSpace = protigazyFNumberOfVehicleSpace,
                numberOfGoods = 30
            ),
            BkItem(
                bkItemName = "ПМГ-2",
                itemsCardSpace = protigazyFNumberOfVehicleSpace,
                numberOfGoods = 35
            ),
            BkItem(
                bkItemName = "РШ-4,ПРВ",
                itemsCardSpace = protigazyFNumberOfVehicleSpace,
                numberOfGoods = 20
            )
        )
    ),
    BkType(
        name = "Протигази ізолюючі",
        childrenItems = listOf(
            BkItem(
                bkItemName = "ІП-4 без РП",
                itemsCardSpace = protigazyINumberOfVehicleSpace,
                numberOfGoods = 10
            ),
            BkItem(
                bkItemName = "ІП-5 без РП",
                itemsCardSpace = protigazyINumberOfVehicleSpace,
                numberOfGoods = 10
            )
        )
    ),
    BkType(
        name = "Регенеративні патрони",
        childrenItems = listOf(
            BkItem(
                bkItemName = "РП-4",
                itemsCardSpace = regenerativnyRP4NumberOfVehicleSpace,
                numberOfGoods = 8
            ),
            BkItem(
                bkItemName = "РП-5",
                itemsCardSpace = regenerativnyRP5NumberOfVehicleSpace,
                numberOfGoods = 10
            ),
            BkItem(
                bkItemName = "Распіратори Р-2",
                itemsCardSpace = regenerativnyRP2NumberOfVehicleSpace,
                numberOfGoods = 125
            ),
            BkItem(
                bkItemName = "Гопкалитови патрони ДП-1",
                itemsCardSpace = regenerativnyDP1NumberOfVehicleSpace,
                numberOfGoods = 30
            ),
            BkItem(
                bkItemName = "Плащі захисні ОП-1",
                itemsCardSpace = regenerativnyPlZahOP1NumberOfVehicleSpace,
                numberOfGoods = 20
            ),
            BkItem(
                bkItemName = "Панчохи захисні",
                itemsCardSpace = regenerativnyPanchZahNumberOfVehicleSpace,
                numberOfGoods = 25
            ),
            BkItem(
                bkItemName = "Рукавички БЛ-1",
                itemsCardSpace = regenerativnyRycavishkiBl1NumberOfVehicleSpace,
                numberOfGoods = 200
            ),
            BkItem(
                bkItemName = "Костюм захисний Л-1",
                itemsCardSpace = regenerativnyKostymZahL1NumberOfVehicleSpace,
                numberOfGoods = 12
            ),
            BkItem(
                bkItemName = "Костюм захисний КЗС",
                itemsCardSpace = regenerativnyKostymZahKZHNumberOfVehicleSpace,
                numberOfGoods = 30
            ),
            BkItem(
                bkItemName = "Мішки прогумовані",
                itemsCardSpace = regenerativnyMishkiProgymNumberOfVehicleSpace,
                numberOfGoods = 40
            )
        )
    ),
    BkType(
        name = "Фільтровентеляційні агрегати й установки",
        childrenItems = listOf(
            BkItem(
                bkItemName = "ФВА-100/50",
                itemsCardSpace = filterVentilyaziyniFVA100NumberOfVehicleSpace,
                numberOfGoods = 4
            ),
            BkItem(
                bkItemName = "ФВА-50/25",
                itemsCardSpace = filterVentilyaziyniFVA50NumberOfVehicleSpace,
                numberOfGoods = 3
            ),
            BkItem(
                bkItemName = "ФВА-50/25Д",
                itemsCardSpace = filterVentilyaziyniFVA50DNumberOfVehicleSpace,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "ФВУ-15-24",
                itemsCardSpace = filterVentilyaziyniFVA15NumberOfVehicleSpace,
                numberOfGoods = 1
            )
        )
    ),
    BkType(
        name = "Фільтровентеляційні агрегати й установки",
        childrenItems = listOf(
            BkItem(
                bkItemName = "ФПТ-100М",
                itemsCardSpace = filterPoglinaychFPT100MNumberOfVehicleSpace,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "ФПТ-200М",
                itemsCardSpace = filterPoglinaychFPT200MNumberOfVehicleSpace,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "ФПТ-200",
                itemsCardSpace = filterPoglinaychFPT200NumberOfVehicleSpace,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "ПФП-1000",
                itemsCardSpace = filterPoglinaychPFP1000NumberOfVehicleSpace,
                numberOfGoods = 1
            )
        )
    ),
    BkType(
        name = "Засоби хімічної розвідки",
        childrenItems = listOf(
            BkItem(
                bkItemName = "ВПХР",
                itemsCardSpace = zasobyHimRozvidkiVPHRNumberOfVehicleSpace,
                numberOfGoods = 5
            ),
            BkItem(
                bkItemName = "АСП (датчик)",
                itemsCardSpace = zasobyHimRozvidkiAspDNumberOfVehicleSpace,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "АСП (блок живлення)",
                itemsCardSpace = zasobyHimRozvidkiAspBlNumberOfVehicleSpace,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "ГСА",
                itemsCardSpace = zasobyHimRozvidkiGSANumberOfVehicleSpace,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "МК-2",
                itemsCardSpace = zasobyHimRozvidkiMKA2NumberOfVehicleSpace,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "МК-3",
                itemsCardSpace = zasobyHimRozvidkiMKA3NumberOfVehicleSpace,
                numberOfGoods = 1
            ),
        )
    ),
    BkType(
        name = "Комплект знаків огородження",
        childrenItems = listOf(
            BkItem(
                bkItemName = "КЗО-1",
                itemsCardSpace = komplectZnakivOgKZO1NumberOfVehicleSpace,
                numberOfGoods = 10
            ),
            BkItem(
                bkItemName = "КЗО-2",
                itemsCardSpace = komplectZnakivOgKZO2NumberOfVehicleSpace,
                numberOfGoods = 6
            ),
            BkItem(
                bkItemName = "Індикатори сигналізатори ДП-64",
                itemsCardSpace = komplectZnakivOgIndicatoryDP64NumberOfVehicleSpace,
                numberOfGoods = 6
            ),
            BkItem(
                bkItemName = "Рентгенметри бортові ДП-3Б, ІМД-21",
                itemsCardSpace = komplectZnakivOgRentgemBDP3BNumberOfVehicleSpace,
                numberOfGoods = 2
            ),
            BkItem(
                bkItemName = "Прилади ППХР",
                itemsCardSpace = komplectZnakivOgPPHRNumberOfVehicleSpace,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "Прилади ДП-5",
                itemsCardSpace = komplectZnakivOgDP5NumberOfVehicleSpace,
                numberOfGoods = 4
            ),
            BkItem(
                bkItemName = "Комплект вимірювача дози ІД-1",
                itemsCardSpace = komplectZnakivOgVimirID1NumberOfVehicleSpace,
                numberOfGoods = 10
            ),
            BkItem(
                bkItemName = "Дозиметричний комплект ДП-22В",
                itemsCardSpace = komplectZnakivOgDozKDp22VNumberOfVehicleSpace,
                numberOfGoods = 4
            ),
            BkItem(
                bkItemName = "Вимірювач дози ІД-11",
                itemsCardSpace = komplectZnakivOgVimirDozID11NumberOfVehicleSpace,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "Вимірювальний пристрій до ІД-11",
                itemsCardSpace = komplectZnakivOgVimirPrID11NumberOfVehicleSpace,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "Реактивні піхотні вогнемети РПВ",
                itemsCardSpace = komplectZnakivOgReactivPNumberOfVehicleSpace,
                numberOfGoods = 3
            ),
            BkItem(
                bkItemName = "Вогнеметні постріли до РПВ",
                itemsCardSpace = komplectZnakivOgVogPosNumberOfVehicleSpace,
                numberOfGoods = 4
            ),
            BkItem(
                bkItemName = "АГП",
                itemsCardSpace = komplectZnakivOgAGPNumberOfVehicleSpace,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "Ручні димові гранати РГД-2",
                itemsCardSpace = komplectZnakivOgRGD2NumberOfVehicleSpace,
                numberOfGoods = 54
            ),
        )
    ),
    BkType(
        name = "Димові шашки",
        childrenItems = listOf(
            BkItem(
                bkItemName = "ДМ-11",
                itemsCardSpace = dymoviShashkiDm11,
                numberOfGoods = 12
            ),
            BkItem(
                bkItemName = "УДШ",
                itemsCardSpace = dymoviShashkiUdsh,
                numberOfGoods = 4
            ),
            BkItem(
                bkItemName = "БДШ-5х, БДШ-5",
                itemsCardSpace = dymoviShashkiBdsh5X,
                numberOfGoods = 1
            ),
        )
    ),
    BkType(
        name = "Димова суміш №1",
        childrenItems = listOf(
            BkItem(
                bkItemName = "Бочка 200л",
                itemsCardSpace = bochka200L,
                numberOfGoods = 180
            ),
            BkItem(
                bkItemName = "Бочка 250л",
                itemsCardSpace = bochka250L,
                numberOfGoods = 225
            )
        )
    ),
    BkType(
        name = "РД-2",
        childrenItems = listOf(
            BkItem(
                bkItemName = "Бочка 200л",
                itemsCardSpace = rd2Bochka200L,
                numberOfGoods = 162
            ),
            BkItem(
                bkItemName = "Бочка 250л",
                itemsCardSpace = rd2Bochka250L,
                numberOfGoods = 16
            ),
            BkItem(
                bkItemName = "СФ-2У",
                itemsCardSpace = cf2y,
                numberOfGoods = 22
            )
        )
    ),
    BkType(
        name = "ДХЕ",
        childrenItems = listOf(
            BkItem(
                bkItemName = "Бочка 200л",
                itemsCardSpace = dxeBochka200L,
                numberOfGoods = 223
            ),
            BkItem(
                bkItemName = "Бочка 250л",
                itemsCardSpace = dxeBochka250L,
                numberOfGoods = 279
            )
        )
    ),
    BkType(
        name = "МЕА",
        childrenItems = listOf(
            BkItem(
                bkItemName = "Бочка 100л",
                itemsCardSpace = mea2Bochka100L,
                numberOfGoods = 90
            ),
            BkItem(
                bkItemName = "Бочка 200л",
                itemsCardSpace = mea2Bochka200L,
                numberOfGoods = 180
            ),
            BkItem(
                bkItemName = "Бочка 250л",
                itemsCardSpace = mea2Bochka250L,
                numberOfGoods = 279
            )
        )
    ),
    BkType(
        name = "Аміачна вода",
        childrenItems = listOf(
            BkItem(
                bkItemName = "Бочка 200л",
                itemsCardSpace = amiachnaVodaBochka200L,
                numberOfGoods = 182
            ),
            BkItem(
                bkItemName = "Бочка 250л",
                itemsCardSpace = amiachnaVodaBochka250L,
                numberOfGoods = 227
            ),
        )
    ),
    BkType(
        name = "РД",
        childrenItems = listOf(
            BkItem(
                bkItemName = "Бочка 200л",
                itemsCardSpace = rdBochka200L,
                numberOfGoods = 126
            ),
            BkItem(
                bkItemName = "Бочка 250л",
                itemsCardSpace = rdBochka250L,
                numberOfGoods = 158
            )
        )
    ),
    BkType(
        name = "ДТС ГК",
        childrenItems = listOf(
            BkItem(
                bkItemName = "Барабан 50",
                itemsCardSpace = dtsGKBarabn50,
                numberOfGoods = 40
            ),
            BkItem(
                bkItemName = "Барабан 25",
                itemsCardSpace = dtsGKBarabn25,
                numberOfGoods = 20
            ),
            BkItem(
                bkItemName = "Дегазаційні прилади комплекти й прилади: ДК-4",
                itemsCardSpace = dtsGKdk4,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "ІДК-1",
                itemsCardSpace = dtsGKidk1,
                numberOfGoods = 10
            ),
            BkItem(
                bkItemName = "ТДП",
                itemsCardSpace = dtsGKtdp,
                numberOfGoods = 5
            ),
            BkItem(
                bkItemName = "ДК-1",
                itemsCardSpace = dtsGKdk1,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "ДК-3",
                itemsCardSpace = dtsGKdk3,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "ІДПС",
                itemsCardSpace = dtsGKidpc,
                numberOfGoods = 10
            ),
            BkItem(
                bkItemName = "МП-800",
                itemsCardSpace = dtsGKmp800,
                numberOfGoods = 1
            ),
        )
    ),
    BkType(
        name = "Хлорпікрин",
        childrenItems = listOf(
            BkItem(
                bkItemName = "Бочка 100л",
                itemsCardSpace = hlorPikrinBochka100L,
                numberOfGoods = 153
            ),
            BkItem(
                bkItemName = "Бочка 150л",
                itemsCardSpace = hlorPikrinBochka150L,
                numberOfGoods = 230
            ),
            BkItem(
                bkItemName = "Бочка 200л",
                itemsCardSpace = hlorPikrinBochka200L,
                numberOfGoods = 306
            ),
            BkItem(
                bkItemName = "Бочка 250л",
                itemsCardSpace = hlorPikrinBochka250L,
                numberOfGoods = 382
            ),
            BkItem(
                bkItemName = "Комплект палаток КПП-1",
                itemsCardSpace = hlorPikrinKpp1,
                numberOfGoods = 360
            ),
            BkItem(
                bkItemName = "СХМ-1",
                itemsCardSpace = hlorPikrinShm1,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "РЯ-СЗ",
                itemsCardSpace = hlorPikrinRyaC3,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "ГК ЗІП до АРС-14",
                itemsCardSpace = hlorPikrinGkZipAPC14,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "ГК ЗІП до АГВ-3М",
                itemsCardSpace = hlorPikrinGkZipAGV3M,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "ГК ЗІП до ДК-4",
                itemsCardSpace = hlorPikrinGkZipDk4,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "ГК ЗІП до ІДК-1",
                itemsCardSpace = hlorPikrinGkZipIdk1,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "ГК ЗІП до ДК-3",
                itemsCardSpace = hlorPikrinGkZipDk3,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "ГК ЗІП до АГП",
                itemsCardSpace = hlorPikrinGkZipAgp,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "ГК ЗІП до РАСТ",
                itemsCardSpace = hlorPikrinGkZipRast,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "ГК ЗІП до ПРХР",
                itemsCardSpace = hlorPikrinGkZipPrxr,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "ГК ЗІП до ТДП",
                itemsCardSpace = hlorPikrinGkZipTdp,
                numberOfGoods = 30
            ),
            BkItem(
                bkItemName = "ГК ЗІП до УАЗ-469рх",
                itemsCardSpace = hlorPikrinGkZipUar469,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "ГК ЗІП до ДП-64",
                itemsCardSpace = hlorPikrinGkZipDp64,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "ГК ЗІП до ДП-3Б,ІМД-21",
                itemsCardSpace = hlorPikrinGkZipDp3BImd21,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "ГК ЗІП до ІМД-1, ДП-5",
                itemsCardSpace = hlorPikrinGkZipImd1Dp5,
                numberOfGoods = 2
            ),
            BkItem(
                bkItemName = "ГК ЗІП до ДП-22В",
                itemsCardSpace = hlorPikrinGkZipDp22V,
                numberOfGoods = 4
            ),
            BkItem(
                bkItemName = "КП ЗІП до ВПХР",
                itemsCardSpace = hlorPikrinGkZipVphr,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "КП ЗІП до ППХР",
                itemsCardSpace = hlorPikrinGkZipPphr,
                numberOfGoods = 1
            ),
            BkItem(
                bkItemName = "Індикаторні трубки",
                itemsCardSpace = hlorPikrinGkZipIndicTrybki,
                numberOfGoods = 1500
            ),
        )
    )
)