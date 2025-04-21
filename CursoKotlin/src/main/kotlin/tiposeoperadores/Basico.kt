package tiposeoperadores

/*
Crie um programa que declare variáveis utilizando os tipos básicos Int, Double e Boolean.
Em seguida, realize uma operação de soma entre dois números (um inteiro e um decimal), e mostre o resultado.
Também utilize uma estrutura condicional simples (if) para exibir uma mensagem baseada no valor booleano.

O foco deste exercício é reforçar a declaração de variáveis com tipos primitivos e o uso dos operadores aritméticos e
condicionais básicos.
 */

fun main() {
    val a: Int = 10
    val b: Double = 5.5
    val soma = a + b
    val ativo: Boolean = true

    println("Soma: $soma")
    println("Status: ${if (ativo) "Ativo" else "Inativo"}")
}