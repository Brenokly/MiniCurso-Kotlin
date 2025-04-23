package arrays

/*
Crie um programa que leia 5 nomes e armazene em um array. Em seguida:

    Capitalize todos os nomes (primeira letra maiúscula);

    Filtre apenas os que começam com a letra "A";

    Ordene em ordem alfabética;

    Junte os nomes filtrados em uma string separada por vírgulas.

Utilize funções map, filter, sorted e joinToString.
*/

fun main() {
    // Declaração do array de nomes com 5 posições
    val nomes = Array(5) { "" }

    // Leitura dos nomes
    for (i in nomes.indices) {
        print("Digite o ${i + 1}º nome: ")
        nomes[i] = readlnOrNull() ?: "Erro ao ler o nome"
    }

    val resultado = nomes
        .map { it.replaceFirstChar { c -> c.uppercase() } }
        .filter { it.startsWith("A") }
        .sorted()
        .joinToString(", ")

    println("Nomes que começam com A (ordenados): $resultado")
}
