fun main() {

    print("How are you feeling today? ")
    val mood = readLine() ?: "neutral"

    val activity = whatShouldIDoTodayFinal(mood)
    println("Suggested activity: $activity")
}

/* FUNCIONES DE CONDICIÓN (single-expression)*/

fun isVeryColdSad(mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0

fun isTooHot(temperature: Int) =
    temperature > 35

fun isPerfectDay(mood: String, weather: String, temperature: Int) =
    mood == "happy" && weather == "sunny" && temperature > 20

/* FUNCIÓN PRINCIPAL*/

fun whatShouldIDoTodayFinal(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {

    return when {
        isVeryColdSad(mood, weather, temperature) ->
            "Stay in bed"

        isTooHot(temperature) ->
            "Go swimming"

        isPerfectDay(mood, weather, temperature) ->
            "Go for a walk"

        mood == "bored" ->
            "Learn some Kotlin"

        else ->
            "Stay home and read."
    }
}
