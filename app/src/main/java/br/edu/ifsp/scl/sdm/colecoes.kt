package br.edu.ifsp.scl.sdm

fun main() {
    // List e MutableList
    var familia: List<String> = listOf<String>("Pedro", "Marcela", "João", "Cadu")

    // familia.add("Paçoca") // Erro porque a lista é imutável

    // Percorrendo usando FOR
    for (integrante in familia){
        println(integrante)
    }
}