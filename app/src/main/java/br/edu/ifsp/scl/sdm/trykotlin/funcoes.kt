package br.edu.ifsp.scl.sdm.trykotlin

/* Função single expression */
//fun multiplos(a: Int = 10, b:Int) = a % b == 0
fun multiplos(a: Int = 10, b:Int) = a%b == 0


/* Função estendida */
infix fun Int.multiplo(b:Int): Boolean{
    return this % b == 0
}

fun main(){
    println(multiplos(10,2))
    println(multiplos(b=1000))
    println(10.multiplo(2))
    println( 10 multiplo 2 )

}