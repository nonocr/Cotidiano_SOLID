package DIP.CON

import DIP.SIN.EmailService

interface Email{
    fun enviarmensaje()
}

class EmailService : Email{
    override fun enviarmensaje() {
        println("Enviando correo...")
    }
}

class Notificador(private val emailService : Email){
    fun notificar(mensaje: String) {
        emailService.enviarmensaje()
    }
}

fun main() {
    val emailservice = EmailService()
    emailservice.enviarMensaje("Hola")
}
