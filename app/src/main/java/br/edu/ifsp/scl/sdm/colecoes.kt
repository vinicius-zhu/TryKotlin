package br.edu.ifsp.scl.sdm

fun main() {
    // List e MutableList
    var familia: List<String> = listOf<String>("Pedro", "Marcela", "João", "Cadu")

    // familia.add("Paçoca") // Erro porque a lista é imutável

    // Percorrendo usando FOR
    for (integrante in familia){
        println(integrante)
    }

    val listaInteiros: List<Int> = (1..10).toList()
    // Percorrer usando FOR usando IntRange
    for (i in 0..9) {
        println(listaInteiros[i])
    }

    val listaInteiros2: List<Int> = (1..10 step 2).toList()
    // Percorrer usando FOR usando IntRange
    for (i in 0..listaInteiros2.size - 1) {
        println(listaInteiros2[i])
    }

    // listaInteiros.add(11)
}