package desvios

fun main() {
    val nota = 8.5

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