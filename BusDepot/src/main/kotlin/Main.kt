import java.util.Calendar

fun main() {
    val busesCount = 3
    var bd = BusDepot(busesCount)

    val nums = arrayOf("14XFV8", "22FJS1", "38EWQ8")

    val drivers = listOf(
        Driver(
            "Alonzo Gonzales",
            33,
            Sex.MALE,
            3,
            "Middle"
        ),
        Driver(
            "Jonathan Romero",
            41,
            Sex.MALE,
            14,
            "Expert"
        ),
        Driver(
            "Albert Driver",
            50,
            Sex.MALE,
            20,
            "Senior"
        )
    )

    val altitudes = arrayOf(100.0f, 200.0f, 300.0f)
    val longitudes = arrayOf(300.0f, 400.0f, 500.0f)

    var t = Calendar.getInstance().time
    bd.registerBus(
        InterCityBus(
             GovernmentNumberInfo(
                 t,
                 nums[0]
             ),
            t,
            2001,
            40,
            drivers[0],
            InterCityRoute(
                3,
                listOf(
                    BusStop(
                        GeoLocation(
                            altitudes[0],
                            longitudes[0]
                        )),
                    BusStop(
                        GeoLocation(
                            altitudes[1],
                            longitudes[1]
                        )),
                    BusStop(
                        GeoLocation(
                            altitudes[2],
                            longitudes[2]
                        )
                    )
                )
            )
        )
    )

    t = Calendar.getInstance().time
    bd.registerBus(
        InterCityBus(
            GovernmentNumberInfo(
                t,
                nums[1]
            ),
            t,
            2010,
            50,
            drivers[1],
            InterCityRoute(
                3,
                listOf(
                    BusStop(
                        GeoLocation(
                            altitudes[2],
                            longitudes[2]
                        )),
                    BusStop(
                        GeoLocation(
                            altitudes[1],
                            longitudes[1]
                        )),
                    BusStop(
                        GeoLocation(
                            altitudes[0],
                            longitudes[0]
                        )
                    )
                )
            )
        )
    )

    t = Calendar.getInstance().time
    bd.registerBus(
        CityBus(
            GovernmentNumberInfo(
                t,
                nums[2]
            ),
            t,
            1998,
            40,
            drivers[2],
            "Moscow"
        )
    )
}