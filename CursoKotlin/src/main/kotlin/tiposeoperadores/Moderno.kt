package tiposeoperadores

fun main() {
    val preco = 29.99
    val desconto = 0.15
    val precoFinal = preco * (1 - desconto)

    println("Preço: R$ %.2f | Desconto: %.0f%% | Final: R$ %.2f".format(preco, desconto * 100, precoFinal))
}

// %f → número com ponto flutuante (Double, Float)

// %.2f → formata com duas casas decimais

// %d → número inteiro

// %s → string

// %.0f%% → imprime valor float como inteiro e o caractere % escapado com %%