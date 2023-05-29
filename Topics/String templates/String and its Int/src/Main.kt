const val DIVISOR = 2

fun main() {
    val num = readln().toInt()

    println("The obtained value is $num and its Int representation after " +
            "division by $DIVISOR is ${num / DIVISOR}")
}