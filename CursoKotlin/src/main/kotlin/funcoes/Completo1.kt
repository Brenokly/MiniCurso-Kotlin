package funcoes

/*
Crie um programa que utilize:

    Uma função com parâmetro com valor padrão;

    Uma função com parâmetros nomeados;

    Uma função que receba quantidade variável de números (vararg).

Essas abordagens mostram como funções podem ser mais flexíveis em Kotlin.
*/

// Parâmetro com valor padrão
fun saudacao(nome: String, saudacao: String = "Olá") {
    println("$saudacao, $nome!")
}

// Parâmetros nomeados
fun apresentarPessoa(nome: String, idade: Int, cidade: String) {
    println("Nome: $nome, Idade: $idade, Cidade: $cidade")
}

// Função com vararg (quantidade variável de argumentos)
fun somarVarios(vararg numeros: Int): Int {
    var soma = 0
    for (numero in numeros) {
        soma += numero
    }
    return soma
}

fun main() {
    saudacao("Lucas")
    saudacao("Ana", "Bem-vinda")

    apresentarPessoa(nome = "Carlos", cidade = "São Paulo", idade = 30)

    val resultado = somarVarios(10, 20, 30, 40)
    println("Soma total: $resultado")
}