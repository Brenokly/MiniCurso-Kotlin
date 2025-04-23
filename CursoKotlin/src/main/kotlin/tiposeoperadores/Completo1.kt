package tiposeoperadores

/*
Crie um programa que:

    Leia o nome (String), a idade (Int), a altura (Double) e se está matriculado (Boolean).

    Mostre o tipo de cada dado usando o operador is.

    Compare a idade com 18 usando operadores relacionais (<, >, ==, !=).

    Mostre o resultado das comparações.
*/

fun main() {
    print("Digite seu nome: ")
    val nome = readlnOrNull() ?: "Desconhecido"

    print("Digite sua idade: ")
    val idade = readlnOrNull()?.toIntOrNull() ?: 0

    print("Digite sua altura: ")
    val altura = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    println("Altura: $altura") // Padrão é número ponto flutuante com "." e não com ","

    print("Está matriculado? (true/false): ")
    val matriculado = readlnOrNull()?.lowercase()?.toBooleanStrictOrNull() ?: false

    println("\nTipos:")
    println("Nome é String? ${nome is String}")
    println("Idade é Int? ${idade is Int}")
    println("Altura é Double? ${altura is Double}")
    println("Matriculado é Boolean? ${matriculado is Boolean}")

    println("\nComparações com idade:")
    println("Idade > 18: ${idade > 18}")
    println("Idade < 18: ${idade < 18}")
    println("Idade == 18: ${idade == 18}")
    println("Idade != 18: ${idade != 18}")
}

// %f → número com ponto flutuante (Double, Float)

// %.2f → formata com duas casas decimais

// %d → número inteiro

// %s → string

// %.0f%% → imprime valor float como inteiro e o caractere % escapado com %%