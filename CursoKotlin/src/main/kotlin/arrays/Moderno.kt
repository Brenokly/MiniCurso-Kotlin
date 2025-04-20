package arrays

fun main() {
    val numeros = (1..10).toList()
    val pares = numeros.filter { it % 2 == 0 }

    println("Números pares: $pares")
    println("Soma dos pares: ${pares.sum()}")

    // Exemplo de uso de map

    val quadrados = numeros.map { it * it }
    println("Quadrados: $quadrados")

    // Exemplo de uso de reduce

    val soma = numeros.reduce { acc, num -> acc + num }
    println("Soma total: $soma")
}