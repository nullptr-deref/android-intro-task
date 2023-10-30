interface Route {
    val stopsCount: Int
    val stops: List<BusStop>

    fun length(): Distance {
        val pairedStops = mutableListOf<Pair<BusStop, BusStop>>();
        var pairedStopsCount: Int = 0;
        while (pairedStopsCount < stops.size) {
            pairedStops.add(Pair<BusStop, BusStop>(stops[pairedStopsCount], stops[pairedStopsCount + 1]))
            pairedStopsCount += 2
        }

        val distances = pairedStops.map { p: Pair<BusStop, BusStop> -> distanceBetweenStops(p.first, p.second) }
        return distances.sum()
    }
}