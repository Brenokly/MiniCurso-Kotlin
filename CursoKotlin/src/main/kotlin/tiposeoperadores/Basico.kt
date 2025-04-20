package tiposeoperadores

fun main() {
    val a: Int = 10
    val b: Double = 5.5
    val soma = a + b
    val ativo: Boolean = true

    println("Soma: $soma")
    println("Status: ${if (ativo) "Ativo" else "Inativo"}")
}