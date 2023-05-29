fun main() {
    val n = readln().toInt()
    var larger = 0
    var smaller = 0
    var perfect = 0

    repeat(n) {
        when (readln().toInt()) {
            0 -> perfect++
            1 -> larger++
            -1 -> smaller++
        }
    }

    println("$perfect $larger $smaller")
}