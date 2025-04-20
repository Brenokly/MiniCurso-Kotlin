package desvios

fun main() {
    val idade = readln().toInt() ?: 0

    if (idade >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }
}