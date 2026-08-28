fun main() {

    val spices = listOf(
        "curry", "pepper", "cayenne",
        "ginger", "red curry", "green curry", "red pepper"
    )
    
    val curriesSorted = spices
        .filter { it.contains("curry") }
        .sortedBy { it.length }

    println("Curries sorted by length:")
    println(curriesSorted)

    val cToE_1 = spices
        .filter { it.startsWith("c") }
        .filter { it.endsWith("e") }

    println("\nStart with c and end with e (way 1):")
    println(cToE_1)

    val cToE_2 = spices
        .filter { it.startsWith("c") && it.endsWith("e") }

    println("\nStart with c and end with e (way 2):")
    println(cToE_2)

    val firstThreeC = spices
        .take(3)
        .filter { it.startsWith("c") }

    println("\nFirst three that start with c:")
    println(firstThreeC)
}
