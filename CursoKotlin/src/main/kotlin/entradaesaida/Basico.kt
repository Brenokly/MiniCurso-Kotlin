package entradaesaida

/*
Crie um programa que solicite ao usuário o nome e a idade, utilizando a função readLine() para capturar a entrada como texto.
O programa deve exibir uma mensagem personalizada de saudação utilizando println, mostrando os dados informados.
Esse exemplo demonstra o uso básico de entrada e saída de dados em Kotlin.
 */

fun main() {
    print("Digite seu nome: ")
    val nome = readlnOrNull() ?: "Não informado"

    print("Digite sua idade: ")
    val idade = readlnOrNull()?.toInt() ?: 0

    println("Olá, $nome! Você tem $idade anos.")
}