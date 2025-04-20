package funções

// Função de extensão
fun Int.quadrado(): Int = this * this

// Função normal com retorno
fun somar(a: Int, b: Int): Int {
    return a + b
}

// Função com retorno Unit (sem retorno explícito) Equivalente a void no Java
fun mostrarMensagem(mensagem: String) {
    println("Mensagem: $mensagem")
}

// Função com valor default em parâmetros
fun saudacao(nome: String = "Visitante") {
    println("Olá, $nome!")
}

// Função com parâmetros nomeados
fun apresentarPessoa(nome: String, idade: Int) {
    println("Nome: $nome, Idade: $idade")
}

// Função que retorna outra função (função de ordem superior)
fun multiplicador(fator: Int): (Int) -> Int {
    return { numero -> numero * fator }
}

// Função lambda atribuída a uma variável
val dobrar: (Int) -> Int = { it * 2 }

fun main() {
    val numero = 7
    println("O quadrado de $numero é ${numero.quadrado()}")

    val soma = somar(3, 5)
    println("Soma de 3 e 5 é $soma")

    mostrarMensagem("Kotlin é incrível!")

    saudacao()
    saudacao("João")

    apresentarPessoa(nome = "Maria", idade = 28)

    val vezesDez = multiplicador(10)
    println("5 vezes 10 é ${vezesDez(5)}")

    println("Dobro de 4 é ${dobrar(4)}")
}