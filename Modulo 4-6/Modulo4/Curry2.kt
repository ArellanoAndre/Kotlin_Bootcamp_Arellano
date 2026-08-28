package Spices

class Curry2(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice2(name, spiciness, color), Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("Grinding the curry")
    }
}