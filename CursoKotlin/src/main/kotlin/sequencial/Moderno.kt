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
    println("Por favor, insira seu nome:")
    val nome = readLine() ?: "Desconhecido"  // Usando readLine para obter input do usuário

    println("Agora, insira sua idade:")
    val idade = readLine()?.toIntOrNull() ?: 0  // Tenta converter para inteiro

    // Criando o mapa de dados do usuário
    val usuario = mapOf("nome" to nome, "idade" to idade)

    // Exibindo os dados do usuário
    println("\nCadastro finalizado com sucesso!\n")
    usuario.forEach { (chave, valor) ->
        println("$chave: $valor")
    }

    // Adicionando algo mais interativo e divertido
    println("\nAgora, vamos calcular sua idade em meses! 🧮")
    val idadeEmMeses = idade * 12
    println("Você tem aproximadamente $idadeEmMeses meses de vida. Uau!")

    // Mensagem final com toque divertido
    if (idade >= 18) {
        println("\nVocê já é maior de idade! 🎉")
    } else {
        println("\nVocê ainda é menor de idade, mas está indo bem! 😉")
    }

    println("\nObrigado por usar o sistema. Até logo, $nome!")
}