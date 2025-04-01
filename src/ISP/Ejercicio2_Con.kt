package ISP.con_

interface trabajador{
    fun trabajar()
}
interface administrador{
    fun administrar()
}
interface auditor{
    fun auditar()
}

class Desarrollador : trabajador{
    override fun trabajar() {
        println("Desarrollando software...")
    }
}

fun main() {
    val desarrollador = Desarrollador()
    desarrollador.trabajar()
}

