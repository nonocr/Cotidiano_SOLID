package OCP.Con

interface TipoGrafica{
    fun Ejecutar(Tipo: String): String
}

class Barras : TipoGrafica{
    override fun Ejecutar(Tipo: String) = "Dibujando grafica de barras"
}

class Lineas : TipoGrafica{
    override fun Ejecutar(tipo: String) = "Dibujando grafica de lineas"
}

class Grafica {
    fun dibujar(tipo: TipoGrafica, Tipo: String): String = tipo.Ejecutar(Tipo)}

fun main() {
    val grafica = Grafica()
    println("Barras: ${grafica.dibujar("Barras")}")
    println("Lineas: ${grafica.dibujar("")}")

}