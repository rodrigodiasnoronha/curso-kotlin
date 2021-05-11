package basic

class FuncaoEmUmaUnicaLinha {
    fun run() {
        val valor1 = this.multiplicar(5, 5);
        println(valor1);

        val valor2 = this.multiplicar(10, 5);
        println(valor2);

        val valor3 = this.dividir(10, 3);
        println(valor3);

        val valor4 = this.somar(10, 21);
        println(valor4);

        val valor5 = this.isPar(5);
        println(valor5);

        val valor6 = this.isPar(6);
        println(valor6);
    }

    // Dessa forma podemos usar uma função em uma única linha
    private fun multiplicar(a: Int, b: Int): Int = a * b;

    // meio que igual a arrow function no javascript
    private fun dividir(a: Int, b: Int): Float = (a.toFloat() / b.toFloat());

    private fun somar(a: Int, b: Int): Int = a + b;

    private fun isPar(numero: Int): Boolean = numero % 2 == 0;
}