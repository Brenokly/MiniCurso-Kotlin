package outros

// Exemplo de funções genéricas
fun <T> imprimirLista(lista: List<T>) {
    for (item in lista) {
        print(item)
    }
    println()
}

// Type alias para simplificar o código e melhorar a legibilidade

typealias Telefone = Pair<String, String>
typealias ListaDeTelefone = List<Telefone>
typealias AgendaTelefonica = Map<String, ListaDeTelefone>

fun main() {
    imprimirLista(listOf(1,2,3))            // Lista de inteiros Saída: 123
    imprimirLista(listOf("a", "b", "c"))    // Lista de strings Saída: abc

    // Função Lambda
    val saudacao = { nome: String -> "Olá, $nome!" }
    println(saudacao("João")) // Olá, João!

    // Função Anônima
    val saudacao2: (String) -> String = fun(nome: String): String {
        return "Olá, $nome!"
    }

    println(saudacao("Maria"))
    println(saudacao2("Breno"))

//    val contatos: Map<String,  List<Pair<String, String>>> = mapOf(
//        "João" to listOf("Casa" to "1234-5678", "Celular" to "9876-5432"),
//        "Maria" to listOf("Casa" to "2345-6789", "Trabalho" to "8765-4321")
//    )


    val contatos: AgendaTelefonica = mapOf(
        "João" to listOf("Casa" to "1234-5678", "Celular" to "9876-5432"),
        "Maria" to listOf("Casa" to "2345-6789", "Trabalho" to "8765-4321")
    )
}