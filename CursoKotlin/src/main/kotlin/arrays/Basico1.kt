package arrays

/*
Crie um programa que declare um array de inteiros com cinco posições. O programa deve:

    Atribuir valores manualmente ao array;

    Exibir todos os elementos;

    Mostrar o primeiro e o último elemento.

Esse exemplo ensina a criação de arrays, acesso por índice e iteração simples com for.
*/

fun main() {
    val numeros = IntArray(5) // Cria um array com 5 posições (todos com valor 0)

    // Atribuindo valores manualmente
    numeros[0] = 10
    numeros[1] = 20
    numeros[2] = 30
    numeros[3] = 40
    numeros[4] = 50

    // Exibindo todos os valores com for tradicional
    for (i in 0 until numeros.size) { // Poderia usar também numeros.indices
        println("Elemento na posição $i: ${numeros[i]}")
    }

    println("Primeiro elemento: ${numeros.first()}")
    println("Último elemento: ${numeros.last()}")
}
