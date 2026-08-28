
class Game2 {

    var path = mutableListOf<Directions>(Directions.START)

    // Lambdas de movimiento
    val north = {
        path.add(Directions.NORTH)
        true
    }

    val south = {
        path.add(Directions.SOUTH)
        true
    }

    val east = {
        path.add(Directions.EAST)
        true
    }

    val west = {
        path.add(Directions.WEST)
        true
    }

    val end = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        false
    }

    // Función que recibe una lambda
    fun move(where: () -> Boolean): Boolean {
        return where()
    }

    // Decide qué movimiento hacer
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
    val game = Game2()

    while (true) {
        print("Enter a direction: n/s/e/w: ")
        val input = readLine()
        game.makeMove(input)
    }
}