package basic

class OperadorElvis {

    fun run() {
        // Operador Elvis ?=
        val test: Int? = null;

        // Usado para dizer que úma variável pode ser nula
        val test2: Int? = 10;

        // se o valor for nulo, o valor 100 será atribuido
        val valor: Int = test ?: 100;

        val valorInput: Float ? = null;

        if (valorInput == null) {
            println("Não tem valor");
        } else {
            println("O valor é $valorInput");
        }
    }
}