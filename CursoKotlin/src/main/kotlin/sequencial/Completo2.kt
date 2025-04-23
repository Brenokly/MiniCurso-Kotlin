package sequencial

/*
    Faça um programa que receba nome, idade, salário e cargo. Armazene em objeto Funcionario.
    Calcule o salário anual e exiba tudo formatado com texto personalizado.
*/

data class Funcionario(
    val nome: String,
    val idade: Int,
    val salarioMensal: Double,
    val cargo: String,
    val salarioAnual: Double = salarioMensal * 12
) {
    constructor (nome: String, idade: Int, salarioMensal: Double, cargo: String) : this(
        nome,
        idade,
        salarioMensal,
        cargo,
        salarioMensal * 12
    )
}

fun main() {
    println("Bem-vindo ao sistema de cadastro!")

    println("Por favor, insira os seguintes dados:")

    print("Nome: ")
    val nome = readlnOrNull() ?: ""

    print("Idade: ")
    val idade = readlnOrNull()?.toIntOrNull() ?: 0

    print("Salário Mensal: ")
    val salarioMensal = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    print("Cargo: ")
    val cargo = readlnOrNull() ?: ""

    val dados = Funcionario(nome, idade, salarioMensal, cargo)

    // Exibe os dados formatados sem usar estrutura de repetição
    println("Dados cadastrados:")
    println("Nome: ${dados.nome}")
    println("Idade: ${dados.idade} anos")
    println("Cargo: ${dados.cargo}")
    println("Salário Mensal: ${dados.salarioMensal}")
    println("Salário Anual: ${dados.salarioAnual}")
}
