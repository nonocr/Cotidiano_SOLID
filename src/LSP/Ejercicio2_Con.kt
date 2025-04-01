package LSP.Con_

open class Dispositivo
open class EncenderControl : Dispositivo(){
open fun encender() {
    println("Encendiendo dispositivo...")
     }
}


class Televisor : EncenderControl()
class Radio : Dispositivo()

fun main() {
    val encenderControl = EncenderControl()
    encenderControl.encender()
}
