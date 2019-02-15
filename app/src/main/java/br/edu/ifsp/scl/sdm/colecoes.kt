package br.edu.ifsp.scl.sdm

fun main() {
    // List e MutableList
    var familia: List<String> = listOf<String>("Pedro", "Marcela", "João", "Cadu")

    // familia.add("Paçoca") // Erro porque a lista é imutável

    // Percorrendo usando FOR
    for (integrante in familia){
        println(integrante)
    }

    val listaInteiros: List<Int> = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // Percorrer usando FOR usando IntRange
    for (i in 0..9) {
        println(listaInteiros[i])
    }

    // listaInteiros.add(11)
}