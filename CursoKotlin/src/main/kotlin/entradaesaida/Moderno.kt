package entradaesaida

fun main() {
    val nome = prompt("Digite seu nome")
    val idade = prompt("Digite sua idade").toIntOrNull() ?: 0

    println("Seja bem-vindo(a), $nome! Sua idade é $idade anos.")
}

fun prompt(mensagem: String): String {
    print("$mensagem: ")
    return readlnOrNull().orEmpty()
}