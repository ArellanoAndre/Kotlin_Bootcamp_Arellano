import kotlin.random.Random

fun main() {

    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0 else Random.nextInt(1, sides + 1)
    }

    gamePlay(rollDice2)
}

fun gamePlay(roll: (Int) -> Int) {
    val result = roll(12)
    println(result)
}
