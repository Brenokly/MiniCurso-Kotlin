package repeticoes

/*
Crie um programa que:

    Use um laço for para exibir todos os números de 1 a 10 (inclusive), e faça a soma desses números.

    Use um laço while para contar de 10 até 1, e exibir os números na tela.

    Utilize o do..while para mostrar os números de 2 em 2, de 0 até 10.

    Por fim, use o operador step para exibir todos os múltiplos de 3 entre 1 e 30.
*/

fun main() {
    // Laço for com range de 1 a 10 e soma
    var soma = 0
    for (i in 1..10) {
        soma += i
        println("Número: $i")
    }
    println("Soma de 1 a 10: $soma")

    // Laço while de 10 a 1
    var contador = 10
    while (contador >= 1) {
        println("Contando de 10 até 1: $contador")
        contador--
    }

    // Laço do..while de 0 até 10, pulando de 2 em 2
    var i = 0
    do {
        println("Número de 2 em 2 (do..while): $i")
        i += 2
    } while (i <= 10)

    // Usando step para múltiplos de 3
    println("\nMúltiplos de 3 entre 1 e 30:")
    for (l in 1..30 step 3) {
        println(l)
    }
}