package desvios

/*
    Crie um programa que leia a idade de uma pessoa e determine se ela é maior ou menor de idade.
    Utilize a estrutura condicional if/else para realizar a verificação e exibir a mensagem adequada.
*/

fun main() {
    print("Informe sua idade: ")
    val idade = readlnOrNull()?.toIntOrNull() ?: 0

    if (idade >= 18) {
        println("Você é maior de idade.")
    } else {
        println("Você é menor de idade.")
    }
}