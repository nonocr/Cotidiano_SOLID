package OCP.Sin

class EnvioArchivos1 {
    fun enviar(archivo: String, tipo: String) {
        when (tipo) {
            "ftp" -> println("Enviando archivo por FTP: $archivo")
            "http" -> println("Enviando archivo por HTTP: $archivo")
            else -> println("Tipo de envío no soportado")
        }
    }
}

fun main() {
    val envio = EnvioArchivos1()
    envio.enviar("documento.txt", "ftp") }