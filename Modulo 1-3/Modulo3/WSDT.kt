fun main() {

    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("happy", "rainy", 12))
    println(whatShouldIDoToday("excited", "sunny", 30))
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {

    return when {
        mood == "happy" && weather == "sunny" && temperature > 20 ->
            "Go for a walk"

        mood == "sad" && weather == "rainy" ->
            "Stay home and read."

        temperature < 10 ->
            "Stay in bed."

        else ->
            "Stay home and read."
    }
}
