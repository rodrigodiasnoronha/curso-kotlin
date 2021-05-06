import java.util.*

class For {
    fun run() {
        val nome = "Rodrigo Dias Noronha";
        val nomeArray = nome.split(" ")

        for (letra in nome) {
            // codigo
        }

        // para pegar o for com o index
        for ((index, value) in nome.withIndex()) {
            // codigo
        }

        // para imprimir números até determinado valor
        for (numero: Int in 1..100) {
            // print("$numero | ")
        }

        // para ir de 2 em 2
        for (numero: Int in 1..100 step 2) {
           // print("$numero ")
        }

        // do maior para o menor
        for (numero in 100 downTo 1 step 5) {
            print("$numero ")
        }
    }
}
