fun main() {

    val divisibleBySeven = mutableListOf<Int>()

    for (i in 0..100) {
        if (i % 7 == 0) {
            divisibleBySeven.add(i)
        }
    }

    println(divisibleBySeven)
}