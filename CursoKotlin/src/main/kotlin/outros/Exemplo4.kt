package outros

// Explicação do uso de apply e also
// apply: Usado para inicializar um objeto e retornar o próprio objeto.
// Também é útil para configurar propriedades de um objeto.

// also: Usado para realizar operações adicionais em um objeto, retornando o próprio objeto.
// Também é útil para encadear chamadas de função.

fun main() {
    val lista = mutableListOf<Int>()

    lista.apply {
        add(1)
        add(2)
        add(3)
    }.also {
        println("Lista atualizada: $it")
    }
}