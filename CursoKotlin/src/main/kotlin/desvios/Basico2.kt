package desvios

/*
    Crie um programa que leia um número inteiro do usuário e verifique se ele é par ou ímpar.
    Use a estrutura if/else e o operador % (módulo) para realizar a verificação.
*/

fun main() {
    print("Digite um número inteiro: ")
    val numero = readlnOrNull()?.toIntOrNull() ?: 0

    if (numero % 2 == 0) {
        println("O número $numero é par.")
    } else {
        println("O número $numero é ímpar.")
    }
}