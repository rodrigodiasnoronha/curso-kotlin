package basic

class Ternario {

    fun run() {
        this.ternario();
    }

    private fun ternario() {
        // não existe o operador ternário tradicional no Kotlin -> a = 1 > 1 ? true : false;
        val valor = 10
        val a = if (valor > 1) "Sim" else "Não"; // jeito correto;
        println(a);
    }
}