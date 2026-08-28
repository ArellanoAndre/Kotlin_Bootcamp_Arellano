import kotlin.random.Random

fun main() {

    val rollDice = { sides: Int ->
        if (sides == 0) 0 else Random.nextInt(1, sides + 1)
    }

    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0 else Random.nextInt(1, sides + 1)
    }

    println(rollDice(12))
    println(rollDice2(12))
}
