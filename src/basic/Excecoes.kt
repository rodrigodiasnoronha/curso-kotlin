package basic

import java.lang.NumberFormatException

class Excecoes {

    fun run() {
        try {
            println("aosidja".toInt())
        } catch (exception: NumberFormatException) {
            println("È preciso digitar o número corretamente")
        } catch (exception: Exception) {
            println("Erro generico");
        } finally {
            println("Sou executado até mesmo se der erro na aplicaçãço");
        }
    }
}