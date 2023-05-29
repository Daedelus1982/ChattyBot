const val INTEREST_RATE = 1.071
const val PROTECTED_MAX = 700_000

fun findYears(depo: Double): Int {
    var deposit = depo
    var years = 0
    while (deposit < PROTECTED_MAX) {
        deposit *= INTEREST_RATE
        years++
    }
    return years
}