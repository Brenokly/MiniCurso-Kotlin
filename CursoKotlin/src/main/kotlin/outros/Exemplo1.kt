package outros
data class Pessoa(val nome: String, val idade: Int)

// Recursos da data class:
fun main() {
    val pessoa = Pessoa("João", 30)
    println(pessoa)

    // Desestruturação
    val (nome, idade) = pessoa
    println("Nome: $nome, Idade: $idade")

    // copy()
    val pessoa2 = pessoa.copy(idade = 31)
    println(pessoa2)

    // equals()
    println(pessoa == pessoa2) // false
    println(pessoa == pessoa) // true

    // hashCode()
    println(pessoa.hashCode())
    println(pessoa2.hashCode())

    // toString()
    println(pessoa.toString())
}