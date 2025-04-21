package repeticoes

/*
Desenvolva um programa em Kotlin que demonstre diferentes formas modernas e idiomáticas de trabalhar com estruturas de repetição.
O código deve incluir:

    Iteração com forEachIndexed para exibir itens de uma lista com seus índices.

    Uso da função repeat() para executar uma ação um número fixo de vezes.

    Diferentes formas de for com range:

        1..5 (de 1 até 5)

        1 until 5 (de 1 até 4)

        5 downTo 1 (decrescente)

        1..5 step 2 (com passo personalizado)

    Um exemplo com fold() para acumular valores de uma lista com log do processo.

Esse exemplo cobre formas tradicionais e funcionais de repetição, permitindo ao aluno compreender tanto o uso imperativo
quanto o funcional que o Kotlin oferece.
 */

fun main() {
    listOf("Maçã", "Banana", "Uva").forEachIndexed { index, fruta ->
        println("${index + 1} - $fruta")
    }

    repeat(3) {
        println("Executando tarefa #${it + 1}")
    }

    // maneiras de fazer for

    for (i in 1..5) {
        println("Contando: $i")
    }

    for (i in 1 until 5) {
        println("Contando: $i")
    }

    for (i in 5 downTo 1) {
        println("Contagem regressiva: $i")
    }

    for (i in 1..5 step 2) {
        println("Contando: $i")
    }

    val numeros = listOf(1, 2, 3, 4, 5)
    val soma = numeros.fold(0) { acc, numero ->
        println("Acumulador: $acc, Número: $numero")
        acc + numero
    }
}