package OCP.Con

interface TipoArchivo{
    fun ejecutar(Tipo: String): String
}

class ftp : TipoArchivo{
    override fun ejecutar(Tipo: String) = "Enviando archivo por FTP"
}

class http : TipoArchivo{
    override fun ejecutar(Tipo: String) = "Enviando archivo por HTTP"
}

class EnvioArchivos {
    fun enviar(archivo: TipoArchivo, Tipo: String): String = archivo.ejecutar(Tipo)}

fun main() {
    val archivos = EnvioArchivos()
    println("${archivos.enviar(ftp(), "FTP")}")
    println("${archivos.enviar(http(), "HTTP")}")

}

