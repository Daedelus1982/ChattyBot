import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    var unaffordable = 0
    while (scanner.hasNextInt()) {
        val purchase = scanner.nextInt()
        if (balance - purchase >= 0) balance -= purchase else unaffordable += purchase
    }
    if (unaffordable == 0) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    } else {
        println(
            "Error, insufficient funds for the purchase. " +
                "Your balance is $balance, but you need $unaffordable."
        )
    }
}
