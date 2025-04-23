package desvios

/*
Crie um programa que leia a nota de um aluno (entre 0 e 10) e classifique seu desempenho com base nos seguintes critérios:

    Excelente: nota ≥ 9

    Bom: nota ≥ 7

    Regular: nota ≥ 5

    Reprovado: nota < 5

Use a estrutura when para tornar o código mais claro e organizado.
*/

fun main() {
    print("Digite a nota do aluno (0 a 10): ")
    val nota = readln().toDouble()

    val resultado = when {
        nota >= 9 -> "Excelente"
        nota >= 7 -> "Bom"
        nota >= 5 -> "Regular"
        else -> "Reprovado"
    }

    println("Desempenho: $resultado")
}

// Exemplo de como esse código ficaria esse java

// public class Desvios {
//     public static void main(String[] args) {
//         double nota = 8.5;
//         String resultado;

//         if (nota >= 9) {
//             resultado = "Excelente";
//         } else if (nota >= 7) {
//            resultado = "Bom";
//         } else if (nota >= 5) {
//             resultado = "Regular";
//         } else {
//             resultado = "Reprovado";
//         }
//         System.out.println("Desempenho: " + resultado);
//     }
// }