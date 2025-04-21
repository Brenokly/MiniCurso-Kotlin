package desvios

/*
Crie um programa que leia a idade de uma pessoa e determine se ela é maior ou menor de idade.
O programa deve usar a estrutura condicional if/else para tomar a decisão e exibir a mensagem correspondente.
Este exercício serve como introdução ao uso de desvios simples em Kotlin.
*/

fun main() {
    val idade = readln().toInt() ?: 0

    if (idade >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }
}