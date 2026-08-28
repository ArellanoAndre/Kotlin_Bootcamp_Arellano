import java.util.Calendar

fun main() {
    val name = "Kotlin"
    println("Hello, $name!")

    dayOfWeek()
}

fun dayOfWeek() {
    println("What day is it today?")

    when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        Calendar.SUNDAY -> println("Sunday")
        Calendar.MONDAY -> println("Monday")
        Calendar.TUESDAY -> println("Tuesday")
        Calendar.WEDNESDAY -> println("Wednesday")
        Calendar.THURSDAY -> println("Thursday")
        Calendar.FRIDAY -> println("Friday")
        Calendar.SATURDAY -> println("Saturday")
    }
}