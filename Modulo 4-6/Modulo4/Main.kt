package Spices

fun main() {
//    val curry = Curry("spicy")
//    println("Curry color: ${curry.color}")
//    curry.prepareSpice()

    val containers = listOf(
        SpiceContainer(Curry("mild")),
        SpiceContainer(Curry("spicy"))
    )

    containers.forEach {
        println(it.label)
    }
}
