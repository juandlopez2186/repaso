package com.angelb6.repaso

fun saludo(n:String){
    println("bienvenido $n")
}
fun sumar():Double{
    println("1st numero")
    val n1= readln().toDouble()
    println("2nd numero")
    val n2= readln().toDouble()
    var tol=n1+n2
    println("el resultado de la suma es $tol")
    rest(n1,n2)
    println("el menor es ${cmen(n1, n2)}")
    var tu=mult(n1,n2)
    return tu

}
fun rest(n1:Double,n2:Double){
    var tol=n1-n2
    println("el resultado de la resta es $tol")
}
fun mult(n1:Double,n2:Double):Double{
    var tol=n1*n2;
    return tol
}
fun cmen(n1:Double,n2:Double)= if (n1<n2)n1 else n2

fun mayor(){
    fun calmayor(n1: Double,n2: Double)=if (n1>n2)n1 else n2
    for (i in 1..5){
        println("ingrese el numero 1")
        val nu1= readln().toDouble()
        println("ingrese el numero 2")
        val nu2= readln().toDouble()
        println("el mayor de los dos es ${calmayor(nu1,nu2)}")
    }
}
fun main() {
    //saludo(n="andres")

    //println("el resultado de la multiplicacion ${sumar()}")
    mayor()
}




