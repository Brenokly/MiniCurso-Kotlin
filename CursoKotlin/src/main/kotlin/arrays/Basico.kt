package arrays

/*
Crie um programa em Kotlin que utilize um array de números inteiros. O programa deve demonstrar como criar, acessar,
modificar, percorrer os elementos com diferentes  tipos de laço e calcular a soma de todos os valores.
Esse exemplo reforça a estrutura sequencial, índices e manipulação de dados em arrays.
*/

fun main() {
    // Formas de declarar um array

    // 1. Usando arrayOf
    val numeros = arrayOf(10, 20, 30, 40, 50)

    // 2. Usando intArrayOf (para arrays de inteiros)
    val numerosInt = intArrayOf(1, 2, 3, 4, 5)

    // 3. Usando Array lambda
    val numerosArray = Array(5) { it } // Cria um array com 5 elementos, cada um sendo o dobro do índice

    // 4. Convertendo outras coleções para array
    val lista = listOf("a", "b", "c")
    val array = lista.toTypedArray()

    // Todos são mutáveis, porém, não é possível alterar o tamanho do array após a criação.

    // Acessando elementos
    println("Primeiro número: ${numeros[0]}") // Também pode ser acessado com numeros.first()
    println("Último número: ${numeros[numeros.size - 1]}") // Também pode ser acessado com numeros.last()

    // Modificando um elemento
    numeros[2] = 35 // Também pode ser feito com numeros.set(2, 35)
    println("Novo valor na posição 2: ${numeros[2]}")

    // Iterando com for tradicional
    println("Todos os números com índice:")
    for (i in numeros.indices) {
        println("Índice $i -> ${numeros[i]}")
    }

    println()

    // Iterando com forEach
    println("Todos os números (usando forEach):")
    numeros.forEach { println(it) }

    println()

    // Soma dos elementos
    val soma = numeros.sum()
    println("Soma dos elementos: $soma")
}