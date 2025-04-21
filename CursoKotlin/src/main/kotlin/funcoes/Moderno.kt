package funcoes

/*
Desenvolva um programa que explore diversos recursos modernos e completos sobre funções em Kotlin.
O objetivo é demonstrar como as funções podem ser utilizadas de formas variadas, flexíveis e idiomáticas. O código deve conter:

    ✅ Uma função de extensão para calcular o quadrado de um número inteiro.

    ✅ Uma função comum com retorno, como uma função de soma.

    ✅ Uma função sem retorno (Unit), semelhante ao void em outras linguagens.

    ✅ Uma função com parâmetro com valor padrão.

    ✅ Uma função com parâmetros nomeados.

    ✅ Uma função de ordem superior, que retorna outra função.

    ✅ Uma função lambda atribuída a uma variável.

    ✅ Uma função com vararg, que aceita um número variável de argumentos.

    ✅ Uma função aninhada (função local), definida dentro de outra função.

No main(), chame cada uma dessas funções com exemplos práticos e comentários explicando sua utilidade,
de forma que sirva como um guia de estudo completo sobre funções em Kotlin.
*/

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

// Função com vararg (argumentos variáveis)
fun listarNomes(vararg nomes: String) {
    nomes.forEach { println(it) }
}

// Função aninhada (função dentro de outra função)
fun processarValor(x: Int) {
    fun dobrar(n: Int): Int = n * 2
    println("Resultado: ${dobrar(x)}")
}

fun main() {
    val numero = 7
    println("O quadrado de $numero é ${numero.quadrado()}")

    val soma = somar(3, 5)
    println("Soma de 3 e 5 é $soma")

    mostrarMensagem("Kotlin é incrível!")

    saudacao() // Usa o valor padrão "Visitante"
    saudacao("João") // Passa um valor personalizado

    apresentarPessoa(nome = "Maria", idade = 28) // Usa parâmetros nomeados

    val vezesDez = multiplicador(10)
    println("5 vezes 10 é ${vezesDez(5)}") // Usa a função de ordem superior

    println("Dobro de 4 é ${dobrar(4)}") // Chamada de lambda atribuída a variável

    // Exemplo com vararg: passando vários nomes
    println("Listando nomes:")
    listarNomes("Ana", "Bruno", "Carlos")

    // Exemplo de função local (função dentro de função)
    println("Processando valor com função aninhada:")
    processarValor(8)
}