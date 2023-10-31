import java.util.*

class InterCityBus(
    override val number: GovernmentNumberInfo,
    override var lastMaintained: Date,
    override val constructionYear: Int,
    override val places: Int,
    override var lastDriver: Driver,
    route: Route
) : Bus {
    private var route: Route = route

    fun changeRoute(newRoute: Route) {
        route = newRoute
    }
}