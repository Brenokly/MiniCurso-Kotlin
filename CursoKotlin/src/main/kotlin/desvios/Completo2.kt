package desvios

/*
Crie um programa que leia a idade de uma pessoa e identifique sua faixa etária:

    Criança: até 12 anos

    Adolescente: de 13 a 17 anos

    Adulto: de 18 a 59 anos

    Idoso: 60 anos ou mais

Use a estrutura when com ranges (in ..) para facilitar a verificação de faixas.
*/

fun main() {
    print("Digite a sua idade: ")
    val idade = readlnOrNull()?.toIntOrNull() ?: 0


    val faixa = when (idade) {
        in 0..12 -> "Criança"
        in 13..17 -> "Adolescente"
        in 18..59 -> "Adulto"
        else -> "Idoso"
    }

    println("Faixa etária: $faixa")
}