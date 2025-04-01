package DIP.con_

interface Motor {
    fun encender()
}
class MotorElectrico : Motor {
    override fun encender() {
        println("Motor electrico encendido")
    }
}
class Vehiculo(private val motor: Motor) {
    fun arrancar() {
        motor.encender()
    }
}

fun main() {
    val motorElectrico = MotorElectrico()
    motorElectrico.encender()
}