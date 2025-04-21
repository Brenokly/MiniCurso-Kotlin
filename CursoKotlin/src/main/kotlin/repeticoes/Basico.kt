package repeticoes

/*
Crie um programa em Kotlin que utilize duas estruturas de repetição fundamentais:

    Um laço for para contar de 1 a 5, imprimindo cada número.

    Um laço while para fazer uma contagem regressiva de 5 até 1.

Esse exemplo básico mostra como implementar loops simples para repetição de tarefas, sendo ideal para quem está iniciando.
 */

fun main() {
    for (i in 1..5) {
        println("Contando: $i")
    }

    var j = 5
    while (j > 0) {
        println("Contagem regressiva: $j")
        j--
    }
}