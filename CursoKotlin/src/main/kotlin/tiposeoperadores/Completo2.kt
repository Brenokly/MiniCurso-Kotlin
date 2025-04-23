package tiposeoperadores

/*
Crie um programa que:

    Leia um número e verifique se ele está no intervalo de 1 a 10 usando in.

    Crie uma variável nula e use o operador de chamada segura (?.) para acessar sua propriedade.

    Use o operador Elvis (?:) para fornecer um valor padrão caso a variável seja nula.

    Combine expressões booleanas usando operadores lógicos (&&, ||, !).
*/

fun main() {
    print("Digite um número entre 1 e 10: ")
    val numero = readlnOrNull()?.toIntOrNull() ?: 0

    // O operador in verifica se o número está dentro do intervalo
    // E o operador de intervalo (..) cria um intervalo de números
    println("Número está entre 1 e 10? ${numero in 1..10}")

    val texto: String? = null // Pode ser nulo ou não

    // O operador de chamada segura (?.) verifica se algo é nulo antes de acessar sua propriedade
    println("Tamanho do texto nulo (com ?.): ${texto?.length}")

    // O operador Elvis (?:) fornece um valor padrão caso o texto seja nulo
    println("Texto com valor padrão (Elvis ?:): ${texto ?: "Texto padrão"}")

    val condicao1 = numero > 5
    val condicao2 = numero < 8

    println("\ncondicao1 (numero > 5): $condicao1")
    println("condicao2 (numero < 8): $condicao2")
    println("condicao1 && condicao2: ${condicao1 && condicao2}")
    println("condicao1 || condicao2: ${condicao1 || condicao2}")
    println("!condicao1: ${!condicao1}")
}