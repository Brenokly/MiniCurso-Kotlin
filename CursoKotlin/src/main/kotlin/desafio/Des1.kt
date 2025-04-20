package desafio

// Desafio: Crie um programa que leia o nome e três notas de um aluno,
// calcule a média e diga se ele foi aprovado (média >= 7), em recuperação (media >= 5) e (media < 5) reprovado.

fun main() {
    val nome = prompt("Digite o nome do aluno")
    val notas = mutableListOf<Double>()

    repeat(3) {
        val nota = prompt("Digite a nota ${it + 1}").toDoubleOrNull() ?: 0.0
        notas.add(nota)
    }

    val media = notas.average()

    val resultado = when {
        media >= 7 -> "Aprovado"
        media >= 5 -> "Recuperação"
        else -> "Reprovado"
    }

    println("Aluno: $nome")
    println("Média: %.2f".format(media))
    println("Situação: $resultado")
}

fun prompt(texto: String): String {
    print("$texto: ")
    return readlnOrNull() ?: ""
}