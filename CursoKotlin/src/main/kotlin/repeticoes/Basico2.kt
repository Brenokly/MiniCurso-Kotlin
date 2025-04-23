package repeticoes

/*
    Agora, vamos adicionar estrutura de repetições para nos auxiliar a adicionar mais alunos.
*/

// data class Aluno(val nome: String, val idade: Int, val periodo: String)

fun main() {
    // Programa que recebe nome, idade e período. E adiciona em uma lista.
    val alunos = mutableListOf<Aluno>()

    print("Quantos alunos deseja cadastrar? ")
    val quantidade = readlnOrNull()?.toIntOrNull() ?: 0

    for (i in 0 until quantidade){
        print("Digite seu nome: ")
        val nome = readlnOrNull() ?: "Desconhecido"

        print("Digite sua idade: ")
        val idade = readlnOrNull()?.toIntOrNull() ?: 0

        print("Digite seu período: ")
        val periodo = readlnOrNull() ?: "Desconhecido"

        println()

        // Adiciona o aluno à lista
        alunos.add(Aluno(nome, idade, periodo))
    }

    // Exibe os dados formatados
    println("Dados cadastrados:\n")
    for (aluno in alunos) {
        println("Nome: ${aluno.nome}")
        println("Idade: ${aluno.idade} anos")
        println("Período: ${aluno.periodo}")
        println()
    }
}

// operadores do for:

// for (i in 0..10) // de 0 a 10

// for (i in 0 until 10) // de 0 a 9

// for (i in 0..10 step 2) // de 0 a 10 pulando de 2 em 2

// for (i in 10 downTo 0) // de 10 a 0

// for (i in 10 downTo 0 step 2) // de 10 a 0 pulando de 2 em 2