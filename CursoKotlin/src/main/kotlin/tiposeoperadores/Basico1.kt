package tiposeoperadores

/*
Crie um programa que leia dois números do tipo Int, e exiba na tela o resultado das seguintes operações:

    Soma

    Subtração

    Multiplicação

    Divisão

    Módulo (resto da divisão)
*/

fun main() {
    print("Digite o primeiro número: ")
    val num1 = readlnOrNull()?.toIntOrNull() ?: 0

    print("Digite o segundo número: ")
    val num2 = readlnOrNull()?.toIntOrNull() ?: 0

    println("Soma:          ${num1 + num2}")
    println("Subtração:     ${num1 - num2}")
    println("Multiplicação: ${num1 * num2}")
    println("Divisão:       ${num1 / num2}")
    println("Módulo:        ${num1 % num2}")
}

// Operadores:

// - Subtração (-)
// - Multiplicação (*)
// - Divisão (/)
// - Módulo (%)

// - Incremento (++) → soma 1 ao valor
// - Decremento (--) → subtrai 1 do valor

// - Operador de atribuição (=) → atribui um valor a uma variável
// - Operador de atribuição composto (+=, -=, *=, /=, %=) → combina atribuição e operação

// - Operador de comparação (==, !=, <, >, <=, >=) → compara dois valores

// - Operador lógico (&&, ||, !) → combina expressões booleanas

// - Operador de identidade (is, !is) → verifica o tipo de um objeto
// - Operador de intervalo (in, !in) → verifica se um valor está dentro de um intervalo

// - Operador Elvis (?:) → fornece um valor padrão se a expressão for nula

// - Operador de chamada segura (?.) → evita NullPointerException ao acessar propriedades ou métodos de um objeto nulo
// - Operador de atribuição segura (?:=) → atribui um valor a uma variável se ela for nula