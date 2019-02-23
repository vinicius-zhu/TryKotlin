package br.edu.ifsp.scl.sdm.trykotlin
/* Passando 1 função por parâmetro */
fun processaTexto(str1: String, str2: String, processa:(s1: String, s2: String) -> String) : String {
    return processa(str1,str2)
}

fun concatena(a:String,b:String):String{
    return "${a}${b}"
}

fun inverte(a: String, b:String): String{
    return b.reversed()+a.reversed()
}

/* Estendendo List<String> */
fun List<String>.paraCadaString(funcao: (s:String) -> String): List<String>{
    val listaStrings: MutableList<String> = mutableListOf()
    // forma pragmática
      /*for(s in this) {
            listaStrings.add(funcao(s))
        }*/

    this.forEach {listaStrings.add(funcao(it))}
    return listaStrings
}

fun <T>List<T>.paraCada(funcao: (t:(T)) -> (T)): List<T>{
    val lista: MutableList<T> = mutableListOf()
    this.forEach {lista.add(funcao(it))}
    return lista
}

fun primeiraLetra(str: String): String{
    return str.first().toString()
}

fun ultimaLetra(str: String): String{
    return str.last().toString()
}

fun incrementa(i: Int): Int{
    return i+1
}

fun main(){
    // Exemplo 1
    println(processaTexto("Olá ", "Mundo", ::concatena))
    println(processaTexto("Olá ", "Mundo", ::inverte))
    println(processaTexto("Olá ", "Mundo", {x,y->x.toUpperCase()+y.toUpperCase()}))

    // Exemplo 2
    val listaNomes: List<String> = listOf("Pedro","João","Maria","José")
    var listaPrimeiraLetra: List<String> = listaNomes.paraCadaString(::primeiraLetra)
    var listaUltimaLetra: List<String> = listaNomes.paraCada(::ultimaLetra)

    //listaPrimeiraLetra.forEach() {println(it)}
    //listaPrimeiraLetra.forEach{println(it)}
    listaPrimeiraLetra.forEach(::println)
    listaUltimaLetra.forEach(::println)

    val listaInteiros: List<Int> = (1..10).toList()
    val listaIncrementos: List<Int> = listaInteiros.paraCada(::incrementa)
    listaIncrementos.forEach{println(it)}

}