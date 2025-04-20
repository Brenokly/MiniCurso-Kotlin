package repeticoes

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