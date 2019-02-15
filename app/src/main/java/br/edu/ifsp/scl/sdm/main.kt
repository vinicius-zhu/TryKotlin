package br.edu.ifsp.scl.sdm

// args: Array<String> deixou de ser obrigatório na versão 1.3
fun main() {
    // Declaração de variável MUTÁVEL
    var frase: String = "Hello, World!"

    // Imprime a variável na tela
    println(frase)

    // Imprimindo String Template
    println("$frase")
    println("${frase}")

    // Com chamada de função
    println("Quantidade de caracteres: ${frase.count()}")

    // Com propriedade (get)
    println("Quantidade de caracteres: ${frase.length}")
}

