package repeticoes

/*
    Crie um programa em Kotlin que receba nome, idade e período de um aluno.
    Armazene os dados em uma Lista de Alunos e exiba as informações formatadas.
*/

data class Aluno(val nome: String, val idade: Int, val periodo: String)

fun main() {
    // Programa que recebe nome, idade e período. E adiciona em uma lista.
    val alunos = mutableListOf<Aluno>()

    print("Digite seu nome: ")
    val nome = readlnOrNull() ?: "Desconhecido"

    print("Digite sua idade: ")
    val idade = readlnOrNull()?.toIntOrNull() ?: 0

    print("Digite seu período: ")
    val periodo = readlnOrNull()?.toIntOrNull() ?: 0

    // Adiciona o aluno à lista
    alunos.add(Aluno(nome, idade, periodo.toString()))

    // Exibe os dados formatados
    println("Dados cadastrados:")
    println("Nome: ${alunos[0].nome}")
    println("Idade: ${alunos[0].idade} anos")
    println("Período: ${alunos[0].periodo}")
}