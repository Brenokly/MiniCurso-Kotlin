package funcoes

/*
Desenvolva um programa com o máximo de variações modernas e idiomáticas de funções em Kotlin:

    Função de extensão;

    Função de ordem superior;

    Lambda atribuída a variável;

    Função aninhada (local);

    Todas as funções anteriores sendo utilizadas no main.

Esse programa deve servir como um guia de estudo e prática.
*/

// Função de extensão
fun Int.quadrado(): Int = this * this

// Função que retorna outra função (ordem superior)
fun operacao(tipo: String): (Int, Int) -> Int {
    return when (tipo) {
        "soma" -> { a, b -> a + b }
        "multiplicacao" -> { a, b -> a * b }
        else -> { a, b -> 0 }
    }
}

// Função lambda atribuída a uma variável
val saudacao2: (String) -> Unit = { nome -> println("Olá, $nome!") }

fun main() {
    // Função de extensão
    val numero = 5
    println("O quadrado de $numero é ${numero.quadrado()}")

    // Função de ordem superior
    val somar = operacao("soma")
    val multiplicar = operacao("multiplicacao")
    println("Soma: ${somar(10, 5)}")
    println("Multiplicação: ${multiplicar(10, 5)}")

    // Lambda
    saudacao2("Maria")

    // Função aninhada (local)
    fun mensagemFinal() {
        println("Todas as funções foram demonstradas com sucesso!")
    }

    mensagemFinal()
}