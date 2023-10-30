import java.util.Date

interface Bus {
    val number: GovernmentNumberInfo
    var lastMaintained: Date
    val constructionYear: Int
    val places: Int
    var lastDriver: Driver
}