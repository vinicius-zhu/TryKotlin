package br.edu.ifsp.scl.sdm.trykotlin

inline fun processaInteiro(i: Int, f:(j: Int) ->Int): Int{
    return f(i)
}
inline fun inverte(x: Int): Int = x*-1

inline infix fun Int.executa(f:(Int) ->Int):Int{
    return f(this)
}

fun main() {
    // Passando uma função comum como parâmetro
    val n: Int = processaInteiro (10, ::inverte)
    println(n)

    // Passando uma função lambda como parâmetro
    val n2: Int = processaInteiro(11,{x:Int->-1*x})
    //val n2: Int = processaInteiro(11, {x->-1*x})
    println(n2)

    // Passando uma função lambda como parâmetro, com um parâmetro apenas
    val n3: Int = processaInteiro(12, {-1*it})
    println(n3)

    // Passando uma função lambda como último parâmetro
    val n4: Int = processaInteiro(13) {-1*it}
    println(n4)

    // Passando lambda para uma função estendida
    val n5: Int = 14.executa {-1*it}
    println(n5)

    // Passando lambda para uma função estendida
    val n6: Int = 15.executa{-1*it}
    println(n6)

    // Passando lambda para uma função estendida
    val n6b: Int = 16 executa {-1*it}
    println(n6b)

    // Atribuindo lambda a uma variavel
    val funcaoLambda: (Int) -> Int = {x: Int -> -1 * x}
    val n7: Int = processaInteiro(16, funcaoLambda)
    println(n7)

    val funcaoLambda2 = {x: Int -> -1 * x}
    val n8: Int = processaInteiro(17, funcaoLambda2)
    println(n7)

}