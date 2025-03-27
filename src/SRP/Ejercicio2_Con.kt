package SRP.CON

class Cliente(val nombre: String, val edad: Int)

class Save(){
    fun guardarCliente(cliente: Cliente){
        println("Guardando usuario: ${cliente.nombre} ")
    }
}

class mail(){
    fun EnviarCorreo(cliente: Cliente){
        println("Enviando correo a: ${cliente.nombre} ")
    }
}


fun main() {
val cliente = Cliente("Donovan", 17)
val Gcliente = Save()
val correo = mail()

Gcliente.guardarCliente(cliente)
correo.EnviarCorreo(cliente)
}