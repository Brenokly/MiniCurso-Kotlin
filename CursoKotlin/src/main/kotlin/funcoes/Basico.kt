package funcoes

/*
Crie uma função simples chamada soma que recebe dois números inteiros e retorna o resultado da soma.
Em seguida, chame essa função no main e exiba o resultado.
Esse exemplo demonstra como declarar, implementar e utilizar uma função com parâmetros e retorno em Kotlin.
*/

fun soma(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    println("Resultado da soma: ${soma(5, 10)}")
}