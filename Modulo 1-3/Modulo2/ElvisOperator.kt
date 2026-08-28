fun main() {

    val nullTest: Int? = null

    val result = nullTest?.plus(1) ?: 0
    println(result)
}