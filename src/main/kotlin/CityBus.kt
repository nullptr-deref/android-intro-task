import java.util.*

class CityBus(
    override val number: GovernmentNumberInfo,
    override var lastMaintained: Date,
    override val constructionYear: Int,
    override val places: Int,
    override var lastDriver: Driver,
    cityName: String
) : Bus {
    private val city = cityName
}