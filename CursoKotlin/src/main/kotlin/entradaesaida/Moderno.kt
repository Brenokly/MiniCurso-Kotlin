package entradaesaida

/*
Reescreva o programa anterior utilizando boas práticas e recursos mais modernos da linguagem Kotlin.
Crie uma função chamada prompt para simplificar a solicitação de entrada do usuário, e use readlnOrNull() com operador de coalescência nula (?:) para tratar possíveis valores inválidos ou nulos.
Ao final, o programa deve exibir uma mensagem de boas-vindas formatada com os dados do usuário.
 */

fun main() {
    val nome = prompt("Digite seu nome")
    val idade = prompt("Digite sua idade").toIntOrNull() ?: 0

    println("Seja bem-vindo(a), $nome! Sua idade é $idade anos.")
}

fun prompt(mensagem: String): String {
    print("$mensagem: ")
    return readlnOrNull().orEmpty()
}