package entradaesaida

/*
    Crie um programa que solicite ao usuário o nome da cidade onde ele mora e o número da casa.
    Depois, exiba uma frase do tipo: "Você mora na cidade X, no número 777".
*/

fun main() {
    print("Digite sua cidade: ")
    val cidade = readlnOrNull()

    print("Digite o número da sua casa: ")
    val numero = readlnOrNull()?.toIntOrNull()

    // O operador ? evita NullPointerException
    // Verificar automaticamente se a variável é nula antes de acessar algo dela.

    // Só acessará o length se cidade não for nula
    println(cidade?.length)

    println("Você mora na cidade $cidade, no número $numero")
}