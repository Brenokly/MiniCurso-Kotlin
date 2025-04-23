package arrays

/*
Crie um programa que:

    Leia 10 números inteiros e armazene em um array;

    Calcule o maior, menor e a média;

    Conte quantos números são pares e ímpares;

    Mostre os números acima da média.

Esse exemplo mostra como extrair estatísticas simples de arrays, aplicando conhecimento de laços, operadores e condicionais.
*/

fun main() {
    val numeros = IntArray(10)

    for (i in numeros.indices) {
        print("Digite o ${i + 1}º número: ")
        numeros[i] = readlnOrNull()?.toIntOrNull() ?: 0
    }

    val maior = numeros.maxOrNull()
    val menor = numeros.minOrNull()
    val media = numeros.average()

    var pares = 0
    var impares = 0
    for (n in numeros) {
        if (n % 2 == 0) pares++ else impares++
    }

    val acimaDaMedia = numeros.filter { it > media }

    println("Maior número: $maior")
    println("Menor número: $menor")
    println("Média: $media")
    println("Pares: $pares | Ímpares: $impares")
    println("Números acima da média: $acimaDaMedia")
}
