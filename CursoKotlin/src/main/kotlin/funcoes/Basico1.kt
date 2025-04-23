package funcoes

/*
    Crie uma função chamada soma que receba dois números inteiros como parâmetros e retorne o resultado da soma.
    No main, solicite que o usuário informe dois números e mostre o resultado da soma.
    Esse exemplo demonstra o uso básico de uma função com parâmetros e retorno.
*/

fun soma(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    print("Digite o primeiro número: ")
    val num1 = readlnOrNull()?.toIntOrNull() ?: 0

    print("Digite o segundo número: ")
    val num2 = readlnOrNull()?.toIntOrNull() ?: 0

    val resultado = soma(num1, num2)
    println("A soma dos números é: $resultado")
}