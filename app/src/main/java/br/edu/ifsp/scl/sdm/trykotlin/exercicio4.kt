package br.edu.ifsp.scl.sdm.trykotlin

fun generica(i:Int,j:Int) = i+j
fun generica(i:String,j:String) = "${i}${j}"
fun generica(i:Int,j:String) = "${i}${j}"
fun generica(i:String,j:Int) = "${i}${j}"

fun <T,U,V>xpto(x: T, y: U, f:(T, U) -> V) : V = f(x,y)

fun main() {
    println(xpto(2,3, ::generica))
    println(xpto("Jo","ão",::generica))
    println(xpto("Jo",3,::generica))
    println(xpto(2,"ão",::generica))
}