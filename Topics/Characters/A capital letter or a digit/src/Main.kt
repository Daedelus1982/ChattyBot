fun main() {
    val char = readln().first()

    println((char.isDigit() && char != '0') || (char.isLetter() && char.isUpperCase()))
}