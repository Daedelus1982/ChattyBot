const val DIV2 = 2
const val DIV3 = 3
const val DIV5 = 5
const val DIV6 = 6

fun main() {
    val num = readln().toInt()

    if (num % DIV2 == 0) println("Divided by $DIV2")
    if (num % DIV3 == 0) println("Divided by $DIV3")
    if (num % DIV5 == 0) println("Divided by $DIV5")
    if (num % DIV6 == 0) println("Divided by $DIV6")
}