package sequencial

/*
    Desenvolva um programa em Kotlin com foco em estrutura sequencial moderna e interativa.
    O programa deve:

        Exibir uma saudação inicial ao usuário;

        Coletar o nome e a idade via entrada de dados (readLine);

        Armazenar os dados em uma estrutura (mapOf);

        Exibir os dados formatados;

        Realizar um cálculo simples (idade em meses) e exibir o resultado;

        Mostrar uma mensagem personalizada com base na idade;

        Finalizar com uma mensagem de agradecimento.

    O foco é reforçar o entendimento de execução sequencial com lógica clara, amigável e sem estruturas de controle como if,
    for ou while dominando o fluxo.
*/

fun main() {
    println("Bem-vindo ao sistema de cadastro!")

    // Coletando dados do usuário
    print("Por favor, insira seu nome: ")
    val nome = readlnOrNull() ?: "Desconhecido" // Lê o nome ou atribui "Desconhecido" se nulo

    print("Agora, insira sua idade: ")
    val idade = readlnOrNull()?.toIntOrNull() ?: 0  // Tenta converter para inteiro

    // Criando o mapa de dados do usuário
    val usuario = mapOf("nome" to nome, "idade" to idade) // O tipo desse mapa é mapOf<String, Any>

    // Exibindo os dados do usuário
    println("\nCadastro finalizado com sucesso!\n")
    println("Nome: ${usuario["nome"]}")
    println("Idade: ${usuario["idade"]} anos")

    // Adicionando algo mais interativo e divertido
    println("\nAgora, vamos calcular sua idade em meses! 🧮")
    val idadeEmMeses = idade * 12
    println("Você tem aproximadamente $idadeEmMeses meses de vida!")

    println("\nObrigado por usar o sistema. Até logo, $nome!")
}