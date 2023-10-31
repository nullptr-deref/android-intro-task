data class InterCityRoute(
    override val stopsCount: Int,
    override val stops: List<BusStop>
) : Route
