package funcoes

/*
    Crie uma função chamada mostrarMensagem que receba um nome como parâmetro e apenas exiba uma saudação personalizada.
    Essa função não deve retornar valor (Unit).
Esse exemplo mostra o uso de funções que executam ações, sem necessidade de retornar algo.
*/

fun mostrarMensagem(nome: String) {
    println("Olá, $nome! Bem-vindo(a) ao curso de Kotlin!")
}

fun main() {
    print("Digite seu nome: ")
    val nome = readlnOrNull() ?: "Visitante"

    mostrarMensagem(nome)
}