package sequencial

/*
Crie um programa que calcule o valor total de uma compra simples, pedindo a quantidade e o preço unitário, e exibindo o total.
*/

fun main() {
    print("Quantidade: ")
    val qtd = readlnOrNull()?.toIntOrNull() ?: 0

    print("Preço unitário: ")
    val preco = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    val total = qtd * preco

    println("Total a pagar: R$ %.2f".format(total))
}

// vararg permite que uma função receba vários argumentos do mesmo tipo, como se fosse um array,
// sem precisar declará-los manualmente como array.