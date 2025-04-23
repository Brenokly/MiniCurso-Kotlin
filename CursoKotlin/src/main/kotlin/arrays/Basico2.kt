package arrays

/*
Crie um programa que leia 5 números inteiros do usuário e armazene em um array. Em seguida:

    Calcule a soma total;

    Calcule a média dos valores;

    Exiba os elementos usando for, forEach e indices.

Esse exercício consolida a entrada de dados, uso de arrays e iteração com diferentes estruturas.
*/

fun main() {
    val numeros = IntArray(5)

    // Leitura dos números
    for (i in numeros.indices) {
        print("Digite o ${i + 1}º número: ")
        numeros[i] = readln().toInt()
    }

    // Soma e média
    var soma = 0
    for (numero in numeros) {
        soma += numero
    }

    val media = soma / numeros.size

    println("Elementos digitados com forEach:")
    numeros.forEach { println(it) }

    println("Soma: $soma")
    println("Média: $media")
}