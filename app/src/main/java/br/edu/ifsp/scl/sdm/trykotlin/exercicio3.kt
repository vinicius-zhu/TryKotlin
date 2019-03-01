package br.edu.ifsp.scl.sdm.trykotlin

fun soma(i:Int,j:Int) = i+j

fun cat(i:String,j:String):String = "${i}${j}"

fun foo(int1: Int, int2: Int, f:(Int, Int) -> Int) : Int {
    return f(int1,int2)
}

fun bar(str1: String, str2: String, f:(String, String) -> String) : String {
    return f(str1,str2)
}

fun main() {
    println(foo(10,20, ::soma))
    println(bar("Ped","ro",::cat))
}