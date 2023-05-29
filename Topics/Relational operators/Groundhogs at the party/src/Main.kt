const val CUPS_LOWER_LIMIT = 10
const val CUPS_UPPER_LIMIT = 20
const val CUPS_LOWER_WEEKEND = 15
const val CUPS_UPPER_WEEKEND = 25

fun main() {
    val butterCups = readln().toInt()
    val weekend = readln().toBoolean()
    val lowerCups = if (weekend) CUPS_LOWER_WEEKEND else CUPS_LOWER_LIMIT
    val upperCups = if (weekend) CUPS_UPPER_WEEKEND else CUPS_UPPER_LIMIT

    println(butterCups >= lowerCups && butterCups <= upperCups)
}