package repeticoes

/*
Crie um programa que:

    Use forEach para percorrer uma lista de números e exibir cada número multiplicado por 2.

    Use repeat() para imprimir uma mensagem de saudação 5 vezes.

    Utilize fold() para somar todos os valores de uma lista de números e strings e mostrar o resultado final.

    Use forEachIndexed para exibir os índices e valores de uma lista.
*/

fun main() {
    // Lista de números
    val numeros = listOf(1, 2, 3, 4, 5)

    // forEach - Percorrer a lista e multiplicar cada número por 2
    println("Multiplicando cada número por 2:")
    numeros.forEach { numero ->
        println("$numero multiplicado por 2: ${numero * 2}")
    }

    // repeat - Imprimir saudação 5 vezes
    println("\nSaudação usando repeat():")
    repeat(5) {
        println("Olá, aluno: $it")
    }

    // fold - Somar todos os valores da lista
    val soma = numeros.fold(0) { acc, num -> acc + num }
    println("\nSoma dos números usando fold(): $soma")

    /// Exemplo de fold com strings
    val words = listOf("Kotlin", "é", "uma", "linguagem", "moderna")

    val sentence = words.fold("") { acc, word ->
        "$acc $word"  // Operação de concatenação
    }

    println(sentence)

    // forEachIndexed - Exibir índice e valor de cada elemento
    println("\nÍndices e valores com forEachIndexed():")
    numeros.forEachIndexed { index, value ->
        println("Índice $index tem o valor $value")
    }
}