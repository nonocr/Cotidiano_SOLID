package LSP.Con

open class FiguraGeometrica
open class Calcular(var lado: Int) : FiguraGeometrica(){
 fun calcularArea(): Int {
    return lado * lado }
}

class cuadrado : Calcular(5)
class rectangulo : FiguraGeometrica()

fun main() {
    val calcular = Calcular(5)
    calcular.calcularArea()
    println("El area de el cuadrado es: ${calcular.calcularArea()}")
}