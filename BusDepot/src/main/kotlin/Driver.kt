class Driver(
    override val fullName: String,
    override val age: Int,
    override val sex: String,
    experience: Int,
    qualification: Qualification
) : Person {
    private var experience: Int = experience
    private var qual: Qualification = qualification

    fun assignQualificationPromotionCourse(info: QualificationPromotionCourseInfo) {
        // to be implemented
    }
}
