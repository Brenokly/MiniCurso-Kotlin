package arrays

/*
Crie um programa em Kotlin que utilize um array de nomes. O programa deve capitalizar
os nomes (primeira letra maiúscula), filtrar aqueles que começam com a letra "A", e ordenar a lista alfabeticamente.
Use recursos modernos como map, filter, sorted e joinToString para praticar o uso funcional com arrays.
*/

fun main() {
    val nomes = arrayOf("ana", "bruno", "Carlos", "aline", "Beatriz", "caio")

    println("Lista original:")
    println(nomes.joinToString())

    // Capitalizando todos os nomes
    // O map aplica uma transformação a cada elemento do array
    val capitalizados = nomes.map { it.replaceFirstChar { c -> c.uppercase() } }

    // Filtrando nomes que começam com 'A' (ignorando maiúsculas/minúsculas)
    val comA = capitalizados.filter { it.startsWith("A", ignoreCase = true) }

    // Ordenando alfabeticamente
    val ordenados = capitalizados.sorted()

    println("\nNomes capitalizados:")
    println(capitalizados.joinToString())

    println("\nNomes que começam com 'A':")
    println(comA.joinToString())

    println("\nNomes ordenados:")
    println(ordenados.joinToString())
}