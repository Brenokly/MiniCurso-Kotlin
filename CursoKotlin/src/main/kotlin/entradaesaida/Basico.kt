package entradaesaida

fun main() {
    print("Digite seu nome: ")
    val nome = readLine()

    print("Digite sua idade: ")
    val idade = readLine()?.toInt()

    println("Olá, $nome! Você tem $idade anos.")
}