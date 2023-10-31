class BusDepot(val cap: Int) {
    private var buses = mutableListOf<Bus>()

    @Throws(IllegalArgumentException::class)
    fun registerBus(bus: Bus) {
        if (buses.isEmpty()) buses.add(bus)
        else {
            for (existingBus in buses) {
                if (existingBus.number.value == bus.number.value) {
                    throw IllegalArgumentException("Bus with such a number is already in the park.")
                } else {
                    buses.add(bus)
                    break
                }
            }
        }
    }
}