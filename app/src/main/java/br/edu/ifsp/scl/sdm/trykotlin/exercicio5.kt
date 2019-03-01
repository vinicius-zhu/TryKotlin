package br.edu.ifsp.scl.sdm.trykotlin

// Funções de alta ordem
fun processaInt(i:Int,f:(Int)->Int):Int{
    return f(i)
}

fun processaInteiros(i:Int,j:Int,f:(Int,Int)->Int):Int{
    return f(i,j)
}

// Funções
fun sum(i: Int,j:Int):Int{
    return i+j
}

fun multiplica(i: Int,j:Int):Int{
    return i*j
}

fun raizQuadrada(numero: Int):Int{
    for (n in 1..numero){
        if (n*n == numero)
            return n
    }
    return -1
}

//Main
fun main(){
    // 1. Chamadas do primeiro passo
    val p1 = processaInteiros(10,20, ::soma)
    println(p1)

    val p2 = processaInteiros(10,20, ::multiplica)
    println(p2)

    val p3 = processaInt(64, ::raizQuadrada)
    println(p3)

    // 2. Chamadas do segundo passo
    val p4: Int = processaInteiros(11,22) {x:Int,y:Int->x+y}
    println(p4)

    val p5: Int = processaInteiros(11,22,{x:Int,y:Int->x*y})
    println(p5)

    val p6: Int = processaInt(121, fun (numero:Int):Int{
        for(n in 1..numero){
            if (n*n == numero)
                return n
        }
        return -1
    })
    println(p6)
}