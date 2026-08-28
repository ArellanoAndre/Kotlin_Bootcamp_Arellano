package Spices

sealed class Spice2(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {

    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            else -> 0
        }

    abstract fun prepareSpice()
}