import kotlin.math.abs

const val BASE = 10

fun getLastDigit(n: Int) = abs(n % BASE)

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}