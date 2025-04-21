package tiposeoperadores

/*
Desenvolva um programa que simule um sistema de precificação com desconto. O programa deve:

    Declarar o valor de um produto e o percentual de desconto;

    Calcular o preço final após o desconto usando operadores aritméticos;

    Exibir os valores formatados usando String.format() ou interpolação;

    Utilizar a formatação com casas decimais (%.2f) e porcentagem (%.0f%%) para uma saída amigável ao usuário.

O objetivo é aplicar de forma moderna e prática os conceitos de tipos numéricos (Double), operações matemáticas,
formatação de saída e o uso idiomático de Kotlin.
 */

fun main() {
    val preco = 29.99
    val desconto = 0.15
    val precoFinal = preco * (1 - desconto)

    println("Preço: R$ %.2f | Desconto: %.0f%% | Final: R$ %.2f".format(preco, desconto * 100, precoFinal))
}

// %f → número com ponto flutuante (Double, Float)

// %.2f → formata com duas casas decimais

// %d → número inteiro

// %s → string

// %.0f%% → imprime valor float como inteiro e o caractere % escapado com %%