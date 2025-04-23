package tiposeoperadores

/*
Faça um programa que leia um número inteiro e mostre:

    O valor após o incremento (++),

    O valor após o decremento (--),

    O valor dobrado usando *=,

    O valor dividido pela metade usando /=.
*/

fun main() {
    print("Digite um número inteiro: ")
    var numero = readlnOrNull()?.toIntOrNull() ?: 0

    println("Valor original: $numero")

    numero++
    println("Após incremento (++): $numero")

    numero--
    println("Após decremento (--): $numero")

    numero *= 2
    println("Dobrando o valor (*=): $numero")

    numero /= 2
    println("Dividindo pela metade (/=): $numero")

    // A posição dos operadores de incremento e decremento é importante

    println("Valor Antes dos Testes: $numero")

    println("Valor Teste1: ${numero++}")

    println("Valor Pós-Teste: $numero")

    println("Valor Teste2: ${++numero}")
}
