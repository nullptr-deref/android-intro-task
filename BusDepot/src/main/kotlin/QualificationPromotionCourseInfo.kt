import java.util.*

typealias Qualification = String
data class QualificationPromotionCourseInfo(
    val start: Date,
    val end: Date,
    val promotesTo: Qualification
)
