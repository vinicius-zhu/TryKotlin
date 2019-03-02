package br.edu.ifsp.scl.sdm.trykotlin

enum class TIPO_OPERACAO {
    SOMA,
    SUBTRACAO,
    MULTIPLICACAO,
    DIVISAO
}

fun subtracao(a: Int, b: Int): Int = a - b

fun operacao(op: TIPO_OPERACAO): (Int,  Int) -> Int{
    val divisao: (Int, Int) -> Int = {x,y -> x/y}
    when(op) {
        TIPO_OPERACAO.SOMA -> return fun(a: Int, b: Int): Int = a + b
        TIPO_OPERACAO.SUBTRACAO -> return ::subtracao
        TIPO_OPERACAO.MULTIPLICACAO -> return {c:Int, d:Int ->c*d}
        TIPO_OPERACAO.DIVISAO -> return divisao
    }
}

fun executaOperacao(i: Int, j: Int, f:(Int,Int)->Int):Int{
    return f(i,j)
}

fun main() {
    // Valores
    val x = 20
    val y = 10

    // Soma
    var acao: (Int, Int) -> Int = operacao(TIPO_OPERACAO.SOMA)
    val soma: Int = executaOperacao(x,y,acao)
    println("Soma: ${soma}")

    // Subtração
    acao = operacao(TIPO_OPERACAO.SUBTRACAO)
    println("Subtração: ${executaOperacao(x,y, acao)}")

    // Multiplicação
    val multiplicacao = executaOperacao(x,y,operacao(TIPO_OPERACAO.MULTIPLICACAO))
    println("Multiplicação: ${multiplicacao}")

    // Divisão
    println("Divisão: ${executaOperacao(x,y,operacao(TIPO_OPERACAO.DIVISAO))}")
}