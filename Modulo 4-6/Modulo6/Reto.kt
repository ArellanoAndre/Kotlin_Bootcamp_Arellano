class Location2(val width: Int = 4, val height: Int = 4) {

    private val map = Array(width) { arrayOfNulls<String>(height) }
    var x = 0
    var y = 0

    init {
        map[0][0] = "You are at the starting point."
        map[0][1] = "You see a quiet forest."
        map[0][2] = "There is a river here."
        map[0][3] = "You reached a mountain."

        map[1][0] = "A small village appears."
        map[1][1] = "You are in an open field."
        map[1][2] = "You hear birds singing."
        map[1][3] = "A dark cave is nearby."

        map[2][0] = "You find an old road."
        map[2][1] = "There is a bridge."
        map[2][2] = "You feel a cold wind."
        map[2][3] = "You see ancient ruins."

        map[3][0] = "You are near the sea."
        map[3][1] = "A lighthouse stands tall."
        map[3][2] = "You smell salt in the air."
        map[3][3] = "You reached the edge of the map."
    }

    fun updateLocation(direction: Directions) {
        when (direction) {
            Directions.NORTH -> y = (y - 1).coerceAtLeast(0)
            Directions.SOUTH -> y = (y + 1).coerceAtMost(height - 1)
            Directions.EAST  -> x = (x + 1).coerceAtMost(width - 1)
            Directions.WEST  -> x = (x - 1).coerceAtLeast(0)
            else -> {}
        }
    }

    fun describeLocation() {
        println(map[x][y])
    }
}

class Game3 {

    private val location = Location2()

    var path = mutableListOf<Directions>(Directions.START)

    val north = {
        path.add(Directions.NORTH)
        location.updateLocation(Directions.NORTH)
        location.describeLocation()
        true
    }

    val south = {
        path.add(Directions.SOUTH)
        location.updateLocation(Directions.SOUTH)
        location.describeLocation()
        true
    }

    val east = {
        path.add(Directions.EAST)
        location.updateLocation(Directions.EAST)
        location.describeLocation()
        true
    }

    val west = {
        path.add(Directions.WEST)
        location.updateLocation(Directions.WEST)
        location.describeLocation()
        true
    }

    val end = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        false
    }

    fun move(where: () -> Boolean): Boolean {
        return where()
    }

    fun makeMove(direction: String?) {
        when (direction) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}

fun main() {
    val game = Game3()

    println("Welcome to the Kotlin Adventure Game!")
    println("You are starting your journey...")

    while (true) {
        print("Enter a direction (n/s/e/w): ")
        val input = readLine()
        game.makeMove(input)
    }
}
