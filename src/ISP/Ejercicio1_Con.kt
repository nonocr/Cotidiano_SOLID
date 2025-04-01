package ISP.CON

interface encendedor{
    fun encender()
}
interface apagador{
    fun apagar()
}
interface conector{
    fun conectarWIFI()
}
interface Actualizador{
    fun actualizarFirmware()
}

class Lampara : encendedor, apagador{
    override fun encender() {
        println("Encendiendo lampara...")
    }
    override fun apagar() {
        println("Apagando lampara...")
    }
}

fun main() {
    val lampara = Lampara()
    lampara.encender()
    lampara.apagar()
}